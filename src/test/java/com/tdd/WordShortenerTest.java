package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordShortenerTest {

    @Test
    public void shortensFourLetterString() {
        WordShortener wordShortener = new WordShortener();

        String shortened = wordShortener.shorten("java");

        assertEquals("j2a", shortened);
    }

    @Test
    public void shortensInternationalizationToI18n() {
        WordShortener wordShortener = new WordShortener();

        String shortened = wordShortener.shorten("Internationalization");

        assertEquals("I18n", shortened);
    }

    @Test
    public void oneLetterStringCannotBeShortened() {
        WordShortener wordShortener = new WordShortener();

        boolean canBeShortened = wordShortener.canBeShortened("a");

        assertFalse(canBeShortened);
    }

    @Test
    public void fourLetterStringCanBeShortened() {
        WordShortener wordShortener = new WordShortener();

        boolean canBeShortened = wordShortener.canBeShortened("aaaa");

        assertTrue(canBeShortened);
    }

    @Test
    public void throwsOnIncorrectString() {
        WordShortener wordShortener = new WordShortener();

        assertThrows(RuntimeException.class, () -> wordShortener.shorten("a"));
    }
}