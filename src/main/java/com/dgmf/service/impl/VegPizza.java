package com.dgmf.service.impl;

import com.dgmf.service.IPizza;
import com.dgmf.service.PizzaService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service // Specific "@Component" annotation
// @Primary
public class VegPizza implements IPizza {
    @Override
    public String getPizza() {
        return "Veg Pizza !";
    }
}
