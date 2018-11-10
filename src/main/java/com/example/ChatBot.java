package com.example;

public class ChatBot {

    private static final String BOT_NAME = "Chat Bot";

    private ChatServer chatServer;

    public void join(ChatServer chatServer) {
        this.chatServer = chatServer;
        chatServer.subscribe(this);
    }

    public void onUserJoined(String user) {

    }

    public void onUserMessage(ChatMessage msg) {
        if (msg.getContent().contains("hi")) {
            sendChatMessage(String.format("Hello %s!", msg.getSender()));
        }
    }

    public void onUserLeft(String user) {

    }

    private void sendChatMessage(String content) {
        ChatMessage msg = new ChatMessage();
        msg.setSender(BOT_NAME);
        msg.setType(ChatMessage.MessageType.CHAT);
        msg.setContent(content);
        chatServer.sendMessage(msg);
    }
}
