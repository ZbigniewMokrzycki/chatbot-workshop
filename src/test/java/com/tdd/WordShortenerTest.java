package com.tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordShortenerTest {

    WordShortener wordShortener = new WordShortener();

    @Test
    void shortensJavaToJ2a() {
        String shortened = wordShortener.shorten("java");

        assertEquals("j2a", shortened);
    }

    @Test
    void shortenFor2LetterWordThrows() {
        try {
            wordShortener.shorten("aa");
            //tutaj
            fail("spodziewalem sie wyjatku ale nic nie bylo");

        } catch (IllegalArgumentException e) {
            // wszystko ok
        }



//        assertThrows(IllegalArgumentException.class, () -> {
//
//            wordShortener.shorten("aa");
//
//        });
    }

    @Test
    void shortensAleksandraToOla() {
        String shorten = wordShortener.shorten("Aleksandra");

    }

    @Test
    void emptyListShouldBeShortenedToEmpty() {
        WordShortener wordShortener = new WordShortener();

        List<String> result = wordShortener.shortenWords(Collections.emptyList());

        assertThat(result).isEmpty();
    }

    @Test
    void shouldShorten3Words() {
        WordShortener wordShortener = new WordShortener();

        List<String> result = wordShortener.shortenWords(Arrays.asList("java"));

        //tutaj asercja
        assertThat(result).hasSize(1);
        assertThat(result).isEqualTo(Arrays.asList("j2a"));
    }
}