package com.tdd.chat;

import com.tdd.chat.connection.ChatConnection;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.RestTemplateXhrTransport;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

import java.util.Arrays;

public class Main {

    private static final String LOCALHOST_URL = "ws://localhost:8080/ws";
    private static final String NGROK_URL = "ws://b010ce78.ngrok.io/ws";
    private static final String DEFAULT_URL = "ws://spring-ws-chat.herokuapp.com/ws";

    public static void main(String[] args) throws InterruptedException {
        String url = args.length > 0 ? args[0] : DEFAULT_URL;

        SockJsClient sockJsClient = new SockJsClient(Arrays.asList(
                new WebSocketTransport(new StandardWebSocketClient()),
                new RestTemplateXhrTransport())
        );
        WebSocketStompClient stompClient = new WebSocketStompClient(sockJsClient);
        stompClient.setMessageConverter(new MappingJackson2MessageConverter());

        ChatBot chatBot = new ChatBot("Chat bot");
        ChatConnection chatConnection = new ChatConnection(stompClient, chatBot);
        chatConnection.connect(url);
        Runtime.getRuntime().addShutdownHook(new Thread(chatConnection::disconnect));
        Thread.currentThread().join();
    }
}