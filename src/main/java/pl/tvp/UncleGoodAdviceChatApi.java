package pl.tvp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class UncleGoodAdviceChatApi implements UncleGoodAdviceApi {

    private final Logger logger = LoggerFactory.getLogger(UncleGoodAdviceChatApi.class);
    private final Random random = new Random();

    @Override
    public void notifyCurseWord(String curseWord, String user, long timestamp) {
        String censored = Arrays.stream(curseWord.split(" "))
                .filter(word -> word.length() > 0)
                .map(this::censored)
                .collect(Collectors.joining(" "));
        logger.info("Wujku, wujku! A " + user + " to powiedzial: " + censored);
        if (random.nextInt() % 2 == 0) {
            return;
        }
        throw new UncleGoodAdviceApiException("Random error!");
    }

    private String censored(String word) {
        return word.charAt(0) + word.replaceAll(".", "*").substring(1);
    }
}
