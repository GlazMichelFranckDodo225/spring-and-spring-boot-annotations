package com.dgmf.config;

import com.dgmf.controller.PizzaController;
import com.dgmf.service.IPizza;
import com.dgmf.service.impl.NonVegPizza;
import com.dgmf.service.impl.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
// @Lazy // All Beans below will be loaded "on-demand" (at runtime)
public class AppConfig {
    // @Bean
    // Below, we can also provide the Bean Name (instead of the default
    // given method name "vegPizza") with the "name" Attribute
    @Bean(name = "vegPizzaBean")
    @Lazy // This Beans below will be loaded "on-demand" (at runtime)
    public IPizza vegPizza() {
        System.out.println("AppConfig Class - Creating a VegPizza Bean");
        return new VegPizza(); // Java-Based Configuration uses "new" keyword
    }

    @Bean
    public IPizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        // return new PizzaController(nonVegPizza());
        return new PizzaController(vegPizza());
    }
}
