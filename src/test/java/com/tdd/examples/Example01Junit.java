package com.tdd.examples;



import com.tdd.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Example01Junit {

    // Podstawowe asercje Junita
    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();

        int sum = calculator.plus(2, 3);

        assertEquals(5, sum);
        // inne asercje do użycia:
        assertEquals(5, sum, "Incorrect sum");
        assertTrue(sum > 2);
        assertFalse(sum == 0);
        assertNotNull(sum);
    }

    // Wyjątki
    @Test
    void divisionByZeroThrowsAnException() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));

        // albo inna, dłuższa wersja która testuje to samo:
        try {
            calculator.div(10, 0);
            fail("Expected an exception - but nothing was thrown!");
        } catch (ArithmeticException e) {
            // złapaliśmy spodziewany wyjątek
        }
    }
}

