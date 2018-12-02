package com.tdd.chat;

public class ChatBot {

    private final String botName = "ChatBot";

    public String onUserMessage(ChatMessage message) {
        if (isGreeting(message.getContent())) {
            return sayHello();
        }
        return "";
    }

    boolean isGreeting(String messageContent) {
        return messageContent.contains("hi");
    }

    String sayHello() {
        return "Hello!";
    }

    public String getBotName() {
        return botName;
    }
}
