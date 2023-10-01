package com.dgmf.service.impl;

import com.dgmf.service.IPizza;
import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements IPizza {
    @Override
    public String getPizza() {
        return "Non-Veg Pizza";
    }
}
