package com.sundarMan.EmployeeBackEnd.services;

import com.sundarMan.EmployeeBackEnd.Models.Employee;
import com.sundarMan.EmployeeBackEnd.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee registerEmployeeByS(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployeesByS() {
        return employeeRepo.findAll();
    }
}
