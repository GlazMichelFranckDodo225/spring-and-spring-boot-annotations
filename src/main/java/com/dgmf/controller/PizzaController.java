package com.dgmf.controller;

import com.dgmf.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("pizzaController")
@Component
public class PizzaController {
    @Autowired // Field injection
    private PizzaService pizzaService;

    /* @Autowired // Constructor injection
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    } */

    /* @Autowired // Setter injection
    public void setPizzaService(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    } */

    public String getPizza() {
        return pizzaService.getPizza();
    }
}
