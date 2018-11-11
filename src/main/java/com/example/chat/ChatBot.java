package com.example.chat;

public class ChatBot {

    private String botName;

    public ChatBot(String botName) {
        this.botName = botName;
    }

    public String onUserMessage(ChatMessage msg) {
        if (isGreeting(msg.getContent())) {
            return String.format("Hello %s!", msg.getSender());
        }
        return "";
    }

    boolean isGreeting(String messageContent) {
        return messageContent.contains("hi");
    }

    public String getBotName() {
        return botName;
    }
}
