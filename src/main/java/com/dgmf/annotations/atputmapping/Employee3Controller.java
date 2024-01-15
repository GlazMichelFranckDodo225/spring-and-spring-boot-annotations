package com.dgmf.annotations.atputmapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api/v3/employees") // Base URI
public class Employee3Controller {
    // Handler Method
    // Map the incoming HTTP POST Request to this Method
    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Employee3 saveEmployee3(@RequestBody Employee3 employee3) {
    public ResponseEntity<Employee3> saveEmployee3(
            @RequestBody Employee3 employee3
    ) {
        Employee3 savedEmployee = new Employee3(
                employee3.getId(), employee3.getFirstName(), employee3.getLastName()
        );

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee3> updateEmployee(
            @PathVariable("id") Long employeeId,
            @RequestBody Employee3 employee3
    ) {
        System.out.println(employeeId);
        System.out.println(employee3.getFirstName());
        System.out.println(employee3.getLastName());
        employee3.setId(employeeId);

        return ResponseEntity.ok(employee3);
    }
}
