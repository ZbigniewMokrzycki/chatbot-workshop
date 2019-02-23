package com.tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {

    @Test
    void sortsNumbers() {
        List<Integer> list = Arrays.asList(5, 2, 1, 8);

        Collections.sort(list);

        assertThat(list).hasSize(4);
        assertThat(list).contains(1, 2);
        assertThat(list).isEqualTo(Arrays.asList(1, 2, 5, 8));

//        assertThat(list).
    }
}
