package com.tdd;

public class WordShortener {

    String shorten(String word) {
        if (!canBeShortened(word)) {
            throw new RuntimeException("Can't be shortened!");
        }
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        int lettersInTheMiddle = word.length() - 2;
        return "" + firstLetter + lettersInTheMiddle + lastLetter;
    }

    boolean canBeShortened(String word) {
        if (word.length() <= 3) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))) {
                return false;
            }
        }
        return true;
    }

}
