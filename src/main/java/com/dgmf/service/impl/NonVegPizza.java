package com.dgmf.service.impl;

import com.dgmf.service.IPizza;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component
// @Primary
public class NonVegPizza implements IPizza {
    @Override
    public String getPizza() {
        return "Non-Veg Pizza";
    }
}
