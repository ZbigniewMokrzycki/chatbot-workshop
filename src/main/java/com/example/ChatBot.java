package com.example;

import java.util.Optional;

public class ChatBot {

    private String botName;

    public ChatBot(String botName) {
        this.botName = botName;
    }

    public Optional<ChatMessage> onUserMessage(ChatMessage msg) {
        if (isGreetingMsg(msg)) {
            return prepareReply(String.format("Hello %s!", msg.getSender()));
        }
        return Optional.empty();
    }

    boolean isGreetingMsg(ChatMessage msg) {
        return msg.getContent().contains("hi");
    }

    private Optional<ChatMessage> prepareReply(String content) {
        ChatMessage msg = new ChatMessage();
        msg.setSender(botName);
        msg.setType(ChatMessage.MessageType.CHAT);
        msg.setContent(content);
        return Optional.of(msg);
    }
}
