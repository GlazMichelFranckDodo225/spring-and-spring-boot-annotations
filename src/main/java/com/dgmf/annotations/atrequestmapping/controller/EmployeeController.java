package com.dgmf.annotations.atrequestmapping.controller;

import com.dgmf.annotations.atrequestmapping.entity.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api") // By default, Map the incoming
// HTTP GET Request to this Method
public class EmployeeController {
    // Handler Method
    // By default, Map the incoming HTTP GET Request to this Method
    @RequestMapping(
            value = "/hello-employee",
            method = RequestMethod.GET // Can be Omitted ==> Default Method
            /* method = RequestMethod.POST
            method = RequestMethod.PUT
            method = RequestMethod.DELETE
            */
    )
    public String hello() {
        return "Hello Employee !";
    }

    // Handler Method
    // By default, Map the incoming HTTP GET Request to this Method
    // @RequestMapping("/employee")
    @RequestMapping(
            value = {
            "/employee", "/admin", "/user"
            },
            method = RequestMethod.GET // Can be Omitted ==> Default Method
            /* method = RequestMethod.POST
            method = RequestMethod.PUT
            method = RequestMethod.DELETE
            */,
            produces = { // Returned Types Required
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_ATOM_XML_VALUE
            },
            consumes = { // Incoming Types Required
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_ATOM_XML_VALUE
            }
    )
    public Employee getEmployee() {
        Employee employee = new Employee(
                1L,
                "John",
                "Doe"
        );

        return employee;
    }
}
