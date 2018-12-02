package com.tdd.chat.bot;

import com.tdd.chat.ChatMessage;

public interface AutoReply {

    boolean canReply(ChatMessage chatMessage);

    String reply(ChatMessage chatMessage);

}
