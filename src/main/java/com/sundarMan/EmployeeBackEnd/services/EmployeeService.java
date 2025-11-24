package com.sundarMan.EmployeeBackEnd.services;

import com.sundarMan.EmployeeBackEnd.Models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee registerEmployeeByS(Employee employee);

    List<Employee> getAllEmployeesByS();

    Employee getEmployeeBYIdByS(String id);

    String deleteEmployeeByIDByS(String id);

    Employee updateEmployeeByS(String id, Employee newEmployee);

    Employee getEmployeeByFNameByC(String firstName);
}
