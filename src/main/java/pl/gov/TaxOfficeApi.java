package pl.gov;

import java.math.BigDecimal;

public interface TaxOfficeApi {

    enum SuspiciousActivityType {
        TAX_AVOIDANCE, THOUGHT_CRIME, LARGE_AMOUNT_MONEY_CONVERSION, OTHER
    }

    void notifySuspiciousActivity(SuspiciousActivityType type, String violator, BigDecimal violationAmountPln);

}
