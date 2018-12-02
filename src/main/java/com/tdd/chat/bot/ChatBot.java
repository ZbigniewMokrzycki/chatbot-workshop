package com.tdd.chat.bot;

import com.tdd.chat.ChatMessage;

import java.util.Arrays;
import java.util.List;

public class ChatBot {

    private final String botName = "ChatBot";

    private final List<AutoReply> autoReplies = Arrays.asList(new Greeting());

    public String onUserMessage(ChatMessage message) {
        for (AutoReply autoReply : autoReplies) {
            if (autoReply.canReply(message)) {
                return autoReply.reply(message);
            }
        }
        return "";
    }

    public String getBotName() {
        return botName;
    }
}
