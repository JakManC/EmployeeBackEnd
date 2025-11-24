package com.sundarMan.EmployeeBackEnd.controllers;

import com.sundarMan.EmployeeBackEnd.Models.Employee;
import com.sundarMan.EmployeeBackEnd.repos.EmployeeRepo;
import com.sundarMan.EmployeeBackEnd.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/public/registerEmployee")
    public ResponseEntity<Employee> regEmployee(@RequestBody Employee employee) {
        Employee registeredEmployee = employeeService.registerEmployeeByS(employee);
        return new ResponseEntity<>(registeredEmployee, HttpStatus.OK);
    }

    @GetMapping("/admin/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployeesByC() {
        List<Employee> employees = employeeService.getAllEmployeesByS();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

}
