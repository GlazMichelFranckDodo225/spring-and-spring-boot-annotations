package com.dgmf.service.impl;

import com.dgmf.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Specific "@Component" annotation
public class VegPizza implements PizzaService {
    @Override
    public String getPizza() {
        return "Veg Pizza !";
    }
}
