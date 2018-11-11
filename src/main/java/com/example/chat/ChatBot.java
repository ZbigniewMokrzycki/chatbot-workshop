package com.example.chat;

import java.util.Optional;

public class ChatBot {

    private String botName;

    public ChatBot(String botName) {
        this.botName = botName;
    }

    public Optional<ChatMessage> onUserMessage(ChatMessage msg) {
        if (isGreeting(msg.getContent())) {
            return prepareReply(String.format("Hello %s!", msg.getSender()));
        }
        return Optional.empty();
    }

    boolean isGreeting(String messageContent) {
        return messageContent.contains("hi");
    }

    private Optional<ChatMessage> prepareReply(String content) {
        ChatMessage msg = new ChatMessage();
        msg.setSender(botName);
        msg.setType(ChatMessage.MessageType.CHAT);
        msg.setContent(content);
        return Optional.of(msg);
    }

    public String getBotName() {
        return botName;
    }
}
