package com.dgmf.annotations.atdeletemapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api/v4/employees") // Base URI
public class Employee4Controller {
    // Handler Method
    // Map the incoming HTTP POST Request to this Method
    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Employee4 saveEmployee4(@RequestBody Employee4 employee4) {
    public ResponseEntity<Employee4> saveEmployee4(
            @RequestBody Employee4 employee4
    ) {
        Employee4 savedEmployee = new Employee4(
                employee4.getId(), employee4.getFirstName(), employee4.getLastName()
        );

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee4> updateEmployee(
            @PathVariable("id") Long employeeId,
            @RequestBody Employee4 employee4
    ) {
        System.out.println(employeeId);
        System.out.println(employee4.getFirstName());
        System.out.println(employee4.getLastName());
        employee4.setId(employeeId);

        return ResponseEntity.ok(employee4);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable("id") Long employeeId
    ) {
        System.out.println(employeeId);

        return ResponseEntity.ok(
                "Employee with id " + employeeId +
                        " Deleted Successfully."
        );
    }
}
