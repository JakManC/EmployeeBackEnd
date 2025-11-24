package com.sundarMan.EmployeeBackEnd.services;

import com.sundarMan.EmployeeBackEnd.Models.Employee;
import com.sundarMan.EmployeeBackEnd.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Employee getEmployeeBYIdByS(String id) {
        Optional<Employee> findEmplById = employeeRepo.findById(id);
        return findEmplById.orElse(null);

    }

    @Override
    public String deleteEmployeeByIDByS(String id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        if (employee.isPresent()) {
            employeeRepo.deleteById(id);
            return "Employee Deleted";
        } else {
            return "Employee Not Deleted............";
        }
    }


}
