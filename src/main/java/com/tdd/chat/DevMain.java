package com.tdd.chat;

import com.tdd.chat.bot.ChatBot;

import java.util.Scanner;

public class DevMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot chatBot = new ChatBot();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int i = line.indexOf(": ");
            if (i > 0) {
                String name = line.substring(0, i);
                String msg = line.substring(i + 2);
                String botMessage = chatBot.onUserMessage(new ChatMessage(msg, name));
                if (!botMessage.equals("")) {
                    System.out.println(chatBot.getBotName() + ":" + botMessage);
                }
            }
        }
    }
}
