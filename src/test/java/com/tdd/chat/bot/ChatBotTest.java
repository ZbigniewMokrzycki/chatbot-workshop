package com.tdd.chat.bot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChatBotTest {

    @Test
    void name() {
        ChatBot chatBot = new ChatBot();

        String reply = chatBot.replyUserMessage("romek", "historia");


        assertThat(reply).isEmpty();

    }

}