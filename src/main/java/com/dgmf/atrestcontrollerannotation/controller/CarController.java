package com.dgmf.atrestcontrollerannotation.controller;

import com.dgmf.atrestcontrollerannotation.entity.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
public class CarController {
    // Handler Method
    @RequestMapping("/car") // Map the incoming HTTP Request
    // to this Method
    public Car getBook() {
        Car car = new Car(
                1L,
                "Renault",
                "Renault Kadjar"
        );

        return car;
    }
}
