package com.dgmf.atrequestmappingannotation.controller;

import com.dgmf.atrequestmappingannotation.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api") // Map the incoming HTTP Request
public class EmployeeController {
    // Handler Method
    @RequestMapping("/hello-employee") // Map the incoming HTTP Request
    // to this Method
    public String hello() {
        return "Hello Employee !";
    }

    // Handler Method
    // @RequestMapping("/employee") // Map the incoming HTTP Request
    // Map the incoming HTTP Requests
    @RequestMapping(value = {
            "/employee", "/admin", "/user"
    }) 
    public Employee getEmployee() {
        Employee employee = new Employee(
                1L,
                "John",
                "Doe"
        );

        return employee;
    }
}
