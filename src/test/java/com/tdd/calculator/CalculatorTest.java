package com.tdd.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addsTwoNumbers() {
        Calculator calculator = new Calculator();

        int sum = calculator.plus(2, 3);

        assertEquals(5, sum);
    }
}