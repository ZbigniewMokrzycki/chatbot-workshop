package com.tdd.chat.bot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChatBotTest {

    @Test
    public void repliesHelloToHi() {
        ChatBot chatBot = new ChatBot();
        String reply = chatBot.replyUserMessage("Romek", "hi");

        Assertions.assertThat(reply).isEqualTo("Hello!");
    }

    @Test
    public void repliesNothingToHiman() {
        ChatBot chatBot = new ChatBot();

        String reply = chatBot.replyUserMessage("Romek", "himan");

        Assertions.assertThat(reply).isEqualTo("");
        Assertions.assertThat(reply).isEmpty();
    }

}