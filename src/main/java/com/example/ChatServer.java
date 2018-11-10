package com.example;

import org.springframework.messaging.simp.stomp.StompFrameHandler;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
import org.springframework.web.socket.messaging.WebSocketStompClient;

import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

public class ChatServer {

    private static final String TOPIC = "/topic/public";

    private final WebSocketStompClient stompClient;

    private StompSession session;

    public ChatServer(WebSocketStompClient stompClient) {
        this.stompClient = stompClient;
    }

    public void connect(String url) {
        StompSessionHandlerAdapter stompHandler = new StompSessionHandlerAdapter() {
            @Override
            public Type getPayloadType(StompHeaders headers) {
                return ChatMessage.class;
            }
        };
        try {
            session = stompClient.connect(url, stompHandler).get(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new ChatConnectionException(e);
        }
    }

    public void subscribe(ChatBot chatBot) {
        session.subscribe(TOPIC, new StompFrameHandler() {
            @Override
            public Type getPayloadType(StompHeaders headers) {
                return ChatMessage.class;
            }
            @Override
            public void handleFrame(StompHeaders headers, Object payload) {
                ChatMessage msg = (ChatMessage) payload;
                switch (msg.getType()) {
                    case CHAT: chatBot.onUserMessage(msg); break;
                    case JOIN: chatBot.onUserJoined(msg.getSender()); break;
                    case LEAVE: chatBot.onUserLeft(msg.getSender()); break;
                }
            }
        });
    }

    public void sendMessage(ChatMessage msg) {
        session.send(TOPIC, msg);
    }

    public void disconnect() {
        if (session != null) {
            session.disconnect();
        }
    }
}
