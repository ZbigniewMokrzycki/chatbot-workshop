package com.tdd.calculator;

import com.tdd.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void sumsTwoNumbers() {
        int a = 1;
        int b = 2;

        int sum = calculator.plus(a, b);

        assertEquals(3, sum);
    }


    @Test
    void absOf5Is5() {
        int abs = calculator.abs(5);

        assertEquals(5, abs);

    }

    @Test
    void absOfNegativeIsPositive() {
        int abs = calculator.abs(-10);

        assertEquals(10, abs);

    }
}
