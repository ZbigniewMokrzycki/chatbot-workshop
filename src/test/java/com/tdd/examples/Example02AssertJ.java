package com.tdd.examples;

/*

import com.tdd.calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Example02AssertJ {

    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();

        int sum = calculator.plus(3, 4);

        assertThat(sum).isEqualTo(7);
        // albo inne możliwości:
        assertThat(sum).isLessThan(10);
        assertThat(sum).isPositive();
        assertThat(sum).isNotZero().isGreaterThan(5).isNotNull();
    }

    @Test
    void sortsNumbers() {
        List<Integer> numbers = Arrays.asList(4, 5, 1, 3, 2);

        Collections.sort(numbers);

        assertThat(numbers).isEqualTo(Arrays.asList(1, 2, 3, 4, 5));
        // albo inne możliwości:
        assertThat(numbers).hasSize(5);
        assertThat(numbers).isNotEmpty();
        assertThat(numbers).contains(5, 1);
        assertThat(numbers).element(0).isEqualTo(1);
    }

    @Test
    void givesUpperCaseString() {
        String string = "abc";

        String upperCase = string.toUpperCase();

        assertThat(upperCase).isEqualTo("ABC");
        // albo inne możliwości:
        assertThat(upperCase).startsWith("A").endsWith("C");
        assertThat(upperCase).isNotEmpty();
    }

}
*/