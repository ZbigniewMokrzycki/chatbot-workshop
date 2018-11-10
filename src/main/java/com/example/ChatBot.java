package com.example;

public class ChatBot {

    private ChatServer chatServer;
    private String botName;

    public ChatBot(String botName) {
        this.botName = botName;
    }

    public void join(ChatServer chatServer) {
        this.chatServer = chatServer;
        chatServer.subscribe(this);
    }

    public void onUserMessage(ChatMessage msg) {
        if (isGreetingMsg(msg)) {
            sendChatMessage(String.format("Hello %s!", msg.getSender()));
        }
    }

    boolean isGreetingMsg(ChatMessage msg) {
        return msg.getContent().contains("hi");
    }

    String getBotName() {
        return botName;
    }

    private void sendChatMessage(String content) {
        ChatMessage msg = new ChatMessage();
        msg.setSender(getBotName());
        msg.setType(ChatMessage.MessageType.CHAT);
        msg.setContent(content);
        chatServer.sendMessage(msg);
    }
}
