package com.dgmf.annotations.atgetmapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api1") // Base URI
public class Employee1Controller {
    // Handler Method
    // Map the incoming HTTP GET Request to this Method
    @RequestMapping("/hello-employee1")
    public String hello() {
        return "Hello Employee1 !";
    }

    // Handler Method
    // Map the incoming HTTP GET Request to this Method
    @GetMapping(value = {
            "/employee1", "/admin1", "/user1"
            }
    )
    public Employee1 getEmployee() {
        Employee1 employee1 = new Employee1(
                1L,
                "John1",
                "Doe1"
        );

        return employee1;
    }
}
