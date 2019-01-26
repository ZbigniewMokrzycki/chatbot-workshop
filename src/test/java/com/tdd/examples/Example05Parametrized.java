package com.tdd.examples;

/*

import com.tdd.calculator.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example05Parametrized {

    //sposób 1
    @ParameterizedTest
    @CsvSource({  // parametry do tego testu deklarujemy w stringu
            " 4,  2,  2",
            " 8,  2,  6",
            " 0, -5,  5",
            "-2, -1, -1"
    })
    void addsNumbers(Integer expectedSum, Integer a, Integer b) {
        Calculator calculator = new Calculator();

        Integer sum = calculator.plus(a, b);

        assertEquals(sum, expectedSum);
    }

    // sposób 2
    @ParameterizedTest
    @MethodSource("parametersForUpperCase") //parametry do tego testu pochodzą z metody `parametersForUpperCase` poniżej
    void makesStringUpperCase(String expectedUpperCaseString, String testedString) {
        String upperCase = testedString.toUpperCase();

        assertEquals(expectedUpperCaseString, upperCase);
    }

    private static List<Arguments> parametersForUpperCase() {
        return Arrays.asList(
                Arguments.of("ALA", "ala"),
                Arguments.of("JAVA", "JaVa"),
                Arguments.of("TOMEK13", "tomek13")
        );
    }
}

*/