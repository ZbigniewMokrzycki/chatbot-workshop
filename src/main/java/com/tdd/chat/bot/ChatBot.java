package com.tdd.chat.bot;

public class ChatBot {

    private final String botName = "ChatBot";

    public String replyUserMessage(String user, String message) {
        if (message.equals("hi")) {
            return "Hello!";
        }
        return "";
    }

    public String getBotName() {
        return botName;
    }
}
