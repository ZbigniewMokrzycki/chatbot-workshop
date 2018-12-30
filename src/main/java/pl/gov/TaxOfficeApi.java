package pl.gov;

import java.math.BigDecimal;

public interface TaxOfficeApi {

    enum SuspiciousActivityType {
        TAX_AVOIDANCE, THOUGHT_CRIME, LARGE_MONEY_AMOUNT, OTHER
    }

    void notifySuspiciousActivity(SuspiciousActivityType type, String violator, BigDecimal violationAmountPln);

}
