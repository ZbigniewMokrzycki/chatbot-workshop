package com.tdd.calculator;

public class Calculator {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
}
