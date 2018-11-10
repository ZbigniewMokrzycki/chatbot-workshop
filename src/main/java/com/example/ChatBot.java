package com.example;

public class ChatBot {

    private ChatServer chatServer;

    private final String botName;

    public ChatBot(String botName) {
        this.botName = getBotName();
    }

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
        msg.setSender(botName);
        msg.setType(ChatMessage.MessageType.CHAT);
        msg.setContent(content);
        chatServer.sendMessage(msg);
    }

    String getBotName() {
        return "Chat bt";
    }
}
