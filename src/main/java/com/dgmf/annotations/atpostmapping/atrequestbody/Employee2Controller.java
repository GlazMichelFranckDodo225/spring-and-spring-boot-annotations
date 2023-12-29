package com.dgmf.annotations.atpostmapping.atrequestbody;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api2/employee2") // Base URI
public class Employee2Controller {
    // Handler Method
    // Map the incoming HTTP POST Request to this Method
    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Employee2 saveEmployee2(@RequestBody Employee2 employee2) {
    public ResponseEntity<Employee2> saveEmployee2(
            @RequestBody Employee2 employee2
    ) {
        Employee2 savedEmployee = new Employee2(
                employee2.getId(), employee2.getFirstName(), employee2.getLastName()
        );

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
