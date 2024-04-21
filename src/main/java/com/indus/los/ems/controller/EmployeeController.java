package com.indus.los.ems.controller;

import com.indus.los.ems.dto.Employee;
import com.indus.los.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

   @PostMapping
    public ResponseEntity<Employee>saveEmployee(@RequestBody  Employee employee)
    {
        Employee saveEmployee1 = employeeService.saveEmployee(employee);
        return  new ResponseEntity<>(saveEmployee1, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id)
    {
       Employee getEmployeeById =  employeeService.getEmployeeById(id);
       return ResponseEntity.ok(getEmployeeById);
    }

    @GetMapping("/getAllEmployess")
    public ResponseEntity<List<Employee>> getAllEmployees(){
       List<Employee> employees = employeeService.getAllEmployees();
       return  ResponseEntity.ok(employees);

    }

}
