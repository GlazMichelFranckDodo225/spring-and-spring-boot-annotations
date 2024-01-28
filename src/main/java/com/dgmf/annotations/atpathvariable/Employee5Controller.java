package com.dgmf.annotations.atpathvariable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api/v5/employees") // Base URI
public class Employee5Controller {
    // Handler Method
    // Map the incoming HTTP POST Request to this Method
    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Employee5 saveEmployee5(@RequestBody Employee5 employee5) {
    public ResponseEntity<Employee5> saveEmployee5(
            @RequestBody Employee5 employee5
    ) {
        Employee5 savedEmployee = new Employee5(
                employee5.getId(), employee5.getFirstName(), employee5.getLastName()
        );

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee5> updateEmployee(
            @PathVariable("id") Long employeeId,
            @RequestBody Employee5 employee5
    ) {
        System.out.println(employeeId);
        System.out.println(employee5.getFirstName());
        System.out.println(employee5.getLastName());
        employee5.setId(employeeId);

        return ResponseEntity.ok(employee5);
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

    // @GetMapping("/path-variable/{id}")
    @GetMapping("/path-variable/{id}/{firstname}/{lastname}")
    public ResponseEntity<String> pathVariable(
            @PathVariable("id") Long employeeId,
            @PathVariable("firstname") String firstname,
            @PathVariable("lastname") String lastname
    ) {
        Employee5 employee5 = new Employee5(
                employeeId, firstname, lastname
        );

        System.out.println(employee5.getId());
        System.out.println(employee5.getFirstName());
        System.out.println(employee5.getLastName());

        return ResponseEntity.ok(
                "Id : " + employee5.getId() + "\n" +
                        "Firstname : " + employee5.getFirstName() + "\n"
                        + "Lastname : " + employee5.getLastName()
        );
    }
}
