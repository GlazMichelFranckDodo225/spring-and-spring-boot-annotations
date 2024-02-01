package com.dgmf.annotations.atrequestparam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// To make this Class a Spring MVC REST Controller to
// handle incoming HTTP Requests
@RestController // @Controller + @ResponseBody
@RequestMapping("/api/v6/employees") // Base URI
public class Employee6Controller {
    // Handler Method
    // Map the incoming HTTP POST Request to this Method
    // @RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    // @ResponseStatus(HttpStatus.CREATED)
    // public Employee6 saveEmployee6(@RequestBody Employee6 Employee6) {
    public ResponseEntity<Employee6> saveEmployee6(
            @RequestBody Employee6 Employee6
    ) {
        Employee6 savedEmployee = new Employee6(
                Employee6.getId(), Employee6.getFirstName(), Employee6.getLastName()
        );

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee6> updateEmployee(
            @PathVariable("id") Long employeeId,
            @RequestBody Employee6 Employee6
    ) {
        System.out.println(employeeId);
        System.out.println(Employee6.getFirstName());
        System.out.println(Employee6.getLastName());
        Employee6.setId(employeeId);

        return ResponseEntity.ok(Employee6);
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
        Employee6 Employee6 = new Employee6(
                employeeId, firstname, lastname
        );

        System.out.println(Employee6.getId());
        System.out.println(Employee6.getFirstName());
        System.out.println(Employee6.getLastName());

        return ResponseEntity.ok(
                "Id : " + Employee6.getId() + "\n" +
                        "Firstname : " + Employee6.getFirstName() + "\n"
                        + "Lastname : " + Employee6.getLastName()
        );
    }

    //http://localhost:8080/api/v6/employees/request-params?id=1&firstname=John&lastname=Doe
    @GetMapping("/request-params")
    public ResponseEntity<String> requestParams(
            @RequestParam("id") Long employeeId,
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname
    ) {
        Employee6 Employee6 = new Employee6(
                employeeId, firstname, lastname
        );

        System.out.println(Employee6.getId());
        System.out.println(Employee6.getFirstName());
        System.out.println(Employee6.getLastName());

        return ResponseEntity.ok(
                "Id : " + Employee6.getId() + "\n" +
                        "Firstname : " + Employee6.getFirstName() + "\n"
                        + "Lastname : " + Employee6.getLastName()
        );
    }
}
