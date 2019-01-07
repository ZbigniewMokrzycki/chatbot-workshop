package pl.tvp;

import com.tdd.chat.connection.ChatConnection;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UncleGoodAdviceChatApi implements UncleGoodAdviceApi {

    private final ChatConnection chatConnection;

    public UncleGoodAdviceChatApi(ChatConnection chatConnection) {
        this.chatConnection = chatConnection;
    }

    @Override
    public void notifyCurseWord(String curseWord, String user, long timestamp) {
        String censored = Arrays.stream(curseWord.split(" "))
                .filter(word -> word.length() > 0)
                .map(this::censored)
                .collect(Collectors.joining(" "));
        chatConnection.sendChat("Wujku, wujku! A " + user + " to powiedzial: " + censored);
    }

    private String censored(String word) {
        return word.charAt(0) + word.replaceAll(".", "*").substring(1);
    }
}
