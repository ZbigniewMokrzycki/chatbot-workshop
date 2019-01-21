package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class WordSplitter {

    // ala ma kota -> [ "ala", "ma", "kota" ]
    public List<String> brokenSplit(String sentence) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            Character ch = sentence.charAt(i);
            currentWord.append(ch);
            if (ch.equals(' ')) {
                words.add(currentWord.toString());
                currentWord = new StringBuilder();
            }
        }
        return words;
    }

    public List<String> split(String sentence) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            Character ch = sentence.charAt(i);
            if (ch.equals(' ')) {
                words.add(currentWord.toString());
                currentWord = new StringBuilder();
            } else {
                currentWord.append(ch);
            }
        }
        words.add(currentWord.toString());
        return words;
    }
}
