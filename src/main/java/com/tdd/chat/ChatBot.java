package com.tdd.chat;

public class ChatBot {

    private String botName;

    public ChatBot(String botName) {
        this.botName = botName;
    }

    public String onUserMessage(ChatMessage message) {
        if (isGreeting(message.getContent())) {
            return "Hello!";
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
