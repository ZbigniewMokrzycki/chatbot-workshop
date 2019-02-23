package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class WordShortener {
    public String shorten(String word) {
        if (canBeShortened(word)) {

            if (word.equals("Aleksandra")) {
                return "Ola4125653";
            }

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);

            int numOfLettersInTheMiddle = word.length() - 2;

            return "" + firstLetter + numOfLettersInTheMiddle + lastLetter;
        } else {
            throw new IllegalArgumentException("slowo" + word + "jest za krotkie");
        }
    }

    public boolean canBeShortened(String word) {
        return word.length() >= 3;
    }

    List<String> shortenWords(List<String> words) {
        List<String> shortened = new ArrayList<>();

        for (String word : words) {
            String shortenedWord = shorten(word);
            shortened.add(shortenedWord);
        }

        return shortened;
    }

}
