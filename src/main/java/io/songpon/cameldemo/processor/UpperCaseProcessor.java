package io.songpon.cameldemo.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpperCaseProcessor {

    private final Logger LOGGER = LoggerFactory.getLogger(UpperCaseProcessor.class);
    public String toUpperCase(String input) {
        LOGGER.info("Changing to upper case");
        return input.toUpperCase();
    }
}
