package com.dgmf.annotations.atrestcontroller.controller;

import com.dgmf.annotations.atrestcontroller.entity.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
public class CarController {
    // Handler Method
    @RequestMapping("/hello-car") // Map the incoming HTTP Request
    // to this Method
    public String hello() {
        return "Hello Car !";
    }

    // Handler Method
    @RequestMapping("/car") // Map the incoming HTTP Request
    // to this Method
    public Car getCar() {
        Car car = new Car(
                1L,
                "Renault",
                "Renault Kadjar"
        );

        return car;
    }
}
