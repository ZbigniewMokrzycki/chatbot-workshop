package com.tdd.currency;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class CurrencyRates {

    private static final String ECB_DAILY_RATES_URL = "https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml";
    private static final String PLN_CODE = "PLN";

    private final RestTemplate template;

    public CurrencyRates() {
        this(new RestTemplate());
    }

    public CurrencyRates(RestTemplate template) {
        this.template = template;
    }

    public BigDecimal getEurPlnRate() {
        return getRate(PLN_CODE);
    }

    private BigDecimal getRate(String currencyCode) {
        ResponseEntity<String> wrapper = template.exchange(ECB_DAILY_RATES_URL, HttpMethod.GET, null, String.class);

        if(!HttpStatus.OK.equals(wrapper.getStatusCode()) || wrapper.getBody() == null) {
            throw new RuntimeException("Error retrieving data from external service.");
        }

        String response = wrapper.getBody();

        List<String> rates = parse(response, currencyCode);
        if(rates.isEmpty()) {
            throw new RuntimeException(String.format("No rate for %s avaialable.", currencyCode));
        }

        return new BigDecimal(rates.get(0)).setScale(5, RoundingMode.HALF_UP);
    }

    private List<String> parse(String xmlData, String currencyCode) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            ByteArrayInputStream input = new ByteArrayInputStream(xmlData.getBytes(StandardCharsets.UTF_8));
            Document doc = builder.parse(input);
            NodeList elements = doc.getElementsByTagName("Cube");
            for (int i = 0; i < elements.getLength(); i++) {
                Node item = elements.item(i);
                NamedNodeMap attributes = item.getAttributes();
                Node currency = attributes.getNamedItem("currency");
                if (currency != null && currency.getNodeValue().equals(currencyCode)) {
                    String rate = attributes.getNamedItem("rate").getNodeValue();
                    return Collections.singletonList(rate);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
        return Collections.emptyList();
    }
}