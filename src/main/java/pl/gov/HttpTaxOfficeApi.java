package pl.gov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class HttpTaxOfficeApi implements TaxOfficeApi {

    private final Logger logger = LoggerFactory.getLogger(HttpTaxOfficeApi.class);

    enum SuspiciousActivityType {
        TAX_AVOIDANCE, THOUGHT_CRIME, LARGE_AMOUNT_MONEY_CONVERSION, OTHER
    }

    void notifySuspiciousActivity(SuspiciousActivityType type, String violator, String info) {
        logger.info("Recorded a violation of " + type + " by " + violator + ": " + info);
        throw new NotImplementedException(); //TODO oglosic przetarg na dostawce implementacji
    }
}
