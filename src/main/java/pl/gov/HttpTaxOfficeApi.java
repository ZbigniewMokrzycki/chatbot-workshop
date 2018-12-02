package pl.gov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class HttpTaxOfficeApi implements TaxOfficeApi {

    private final Logger logger = LoggerFactory.getLogger(HttpTaxOfficeApi.class);

    enum SuspiciousActivityType {
        TAX_AVOIDANCE, THOUGHT_CRIME, LARGE_AMOUNT_MONEY_CONVERSION, OTHER
    }

    void notifySuspiciousActivity(SuspiciousActivityType type, String violator, BigDecimal violationAmountPln) {
        logger.info("Recorded a violation of " + type + " by " + violator + ": " + violationAmountPln);
        //TODO oglosic przetarg na dostawce implementacji
    }
}
