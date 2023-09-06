package com.dgmf.controller;

import org.springframework.stereotype.Component;

// @Component("pizzaController")
@Component
public class PizzaController {
    public String getPizza() {
        return "Hot Pizza !";
    }
}
