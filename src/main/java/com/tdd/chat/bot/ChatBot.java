package com.tdd.chat.bot;

public class ChatBot {

    public String replyUserMessage(String user, String message) {
        if (message.contains("hi")) {
            return "Hello!";
        }
        return "";
    }

    public String getBotName() {
        return Hostname.getHostname() + "_bot";
    }
}
