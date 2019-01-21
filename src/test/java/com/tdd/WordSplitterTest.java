package com.tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordSplitterTest {

    @Test
    public void splitsSingleWordToOneElementList() {
        WordSplitter wordSplitter = new WordSplitter();

        List<String> words = wordSplitter.split("ponton");

        assertThat(words).isEqualTo(Collections.singletonList("ponton"));
    }

    @Test
    public void correctlySplitsWords() {
        WordSplitter wordSplitter = new WordSplitter();

        List<String> words = wordSplitter.split("ala ma kota");

        assertThat(words).contains("ma", "ala");
        assertThat(words).containsSequence("ala", "ma");
        assertThat(words).isEqualTo(Arrays.asList("ala", "ma", "kota"));
        assertThat(words).hasSize(3);
        assertThat(words).isNotNull();
    }
}