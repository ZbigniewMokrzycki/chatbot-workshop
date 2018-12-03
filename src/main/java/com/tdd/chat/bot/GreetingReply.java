package com.tdd.chat.bot;

import com.tdd.chat.ChatMessage;

public class GreetingReply implements AutoReply {

    @Override
    public boolean canReply(ChatMessage chatMessage) {
        return chatMessage.getContent().contains("hi");
    }

    @Override
    public String reply(ChatMessage chatMessage) {
        return "Hello!";
    }
}
