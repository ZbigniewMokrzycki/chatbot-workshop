package com.tdd.currency;

public class CurrencyRateUnavailableException extends Exception {
    public CurrencyRateUnavailableException(String s) {
        super(s);
    }

    public CurrencyRateUnavailableException(Exception e) {
        super(e);
    }
}
