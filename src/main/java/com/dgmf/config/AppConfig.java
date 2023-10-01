package com.dgmf.config;

import com.dgmf.service.IPizza;
import com.dgmf.service.impl.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // @Bean
    // Below, we can also provide the Bean Name (instead of the default
    // given method name "vegPizza") with the "name" Attribute
    @Bean(name = "vegPizzaBean")
    public IPizza vegPizza() {
        System.out.println("AppConfig Class - Creating a VegPizza Bean");
        return new VegPizza(); // Java-Based Configuration uses "new" keyword
    }
}
