package com.dgmf.atvalueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Default Name")
    private String defaultName;

    public String getDefaultName() {
        return defaultName;
    }
}
