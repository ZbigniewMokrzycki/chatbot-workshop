package com.tdd.chat.bot;

import com.tdd.chat.ChatMessage;

public class ChatBot {

    private final String botName = "ChatBot";

    public String onUserMessage(ChatMessage message) {
        if (message.getContent().contains("hi")) {
            return "Hello!";
        }
        return "";
    }

    public String getBotName() {
        return botName;
    }
}
