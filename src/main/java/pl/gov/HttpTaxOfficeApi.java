package pl.gov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.math.BigDecimal;
import java.util.Random;

public class HttpTaxOfficeApi implements TaxOfficeApi {

    private final Logger logger = LoggerFactory.getLogger(HttpTaxOfficeApi.class);
    private final Random random = new Random();

    public void notifySuspiciousActivity(SuspiciousActivityType type, String violator, BigDecimal violationAmountPln) {
        logger.info("Recorded a violation of " + type + " by " + violator + ": " + violationAmountPln);
        if (random.nextInt() % 2 == 0) {
            return;
        }
        throw new NotImplementedException(); //TODO oglosic przetarg na dostawce implementacji
    }
}
