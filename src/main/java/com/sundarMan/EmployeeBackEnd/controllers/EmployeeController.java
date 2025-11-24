package com.sundarMan.EmployeeBackEnd.controllers;

import com.sundarMan.EmployeeBackEnd.Models.Employee;
import com.sundarMan.EmployeeBackEnd.repos.EmployeeRepo;
import com.sundarMan.EmployeeBackEnd.services.EmployeeService;
import jakarta.validation.Valid;
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
    public ResponseEntity<Employee> regEmployee(@Valid @RequestBody Employee employee) {
        Employee registeredEmployee = employeeService.registerEmployeeByS(employee);
        return new ResponseEntity<>(registeredEmployee, HttpStatus.OK);
    }

    @GetMapping("/admin/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployeesByC() {
        List<Employee> employees = employeeService.getAllEmployeesByS();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


    @GetMapping("/admin/getEmployeeById/{id}")
    public ResponseEntity<Employee> getEmployeeByIdByC(@PathVariable String id) {
        Employee foundedEmployee = employeeService.getEmployeeBYIdByS(id);
        return new ResponseEntity<>(foundedEmployee, HttpStatus.FOUND);
    }

    @DeleteMapping("/admin/deleteEmployeeById/{id}")
    public ResponseEntity<String> deleteEmplByIdByC(@PathVariable String id) {
        String s = employeeService.deleteEmployeeByIDByS(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @PutMapping("/admin/updateEmployeeById/{id}")
    public ResponseEntity<Employee> updateEmployeeByIdByC(@PathVariable String id, @RequestBody Employee newEmployee) {
        Employee updatedEmployee = employeeService.updateEmployeeByS(id, newEmployee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }


    @GetMapping("/admin/getEmployeeByFirstName/{firstName}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String firstName) {
        Employee employee = employeeService.getEmployeeByFNameByC(firstName);
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }

}
