package com.example.chat.connection;

import com.example.chat.ChatBot;
import com.example.chat.ChatMessage;
import org.springframework.messaging.simp.stomp.StompFrameHandler;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
import org.springframework.web.socket.messaging.WebSocketStompClient;

import java.lang.reflect.Type;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class ChatConnection {

    private static final String TOPIC = "/topic/public";

    private final WebSocketStompClient stompClient;
    private final ChatBot chatBot;

    private StompSession session;

    public ChatConnection(WebSocketStompClient stompClient, ChatBot chatBot) {
        this.stompClient = stompClient;
        this.chatBot = chatBot;
    }

    public synchronized void connect(String url) {
        StompSessionHandlerAdapter stompHandler = new StompSessionHandlerAdapter() {
            @Override
            public Type getPayloadType(StompHeaders headers) {
                return ChatMessage.class;
            }
        };
        try {
            session = stompClient.connect(url, stompHandler).get(5, TimeUnit.SECONDS);
            sendMessage(ChatMessage.MessageType.JOIN);
            subscribe();
        } catch (Exception e) {
            throw new ChatConnectionException(e);
        }
    }

    private void subscribe() {
        session.subscribe(TOPIC, new StompFrameHandler() {
            @Override
            public Type getPayloadType(StompHeaders headers) {
                return ChatMessage.class;
            }
            @Override
            public void handleFrame(StompHeaders headers, Object payload) {
                ChatMessage msg = (ChatMessage) payload;
                if (ChatMessage.MessageType.CHAT.equals(msg.getType())) {
                    Optional<ChatMessage> botReply = chatBot.onUserMessage(msg);
                    botReply.ifPresent(reply -> session.send(TOPIC, reply));
                }
            }
        });
    }

    public synchronized void disconnect() {
        if (session != null) {
            sendMessage(ChatMessage.MessageType.LEAVE);
            session.disconnect();
        }
    }

    private void sendMessage(ChatMessage.MessageType messageType) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setType(messageType);
        chatMessage.setSender(chatBot.getBotName());
        session.send(TOPIC, chatMessage);
    }
}
