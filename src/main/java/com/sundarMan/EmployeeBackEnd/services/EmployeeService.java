package com.sundarMan.EmployeeBackEnd.services;

import com.sundarMan.EmployeeBackEnd.Models.Employee;

import java.util.List;

public interface EmployeeService
{

    Employee registerEmployeeByS(Employee employee);

    List<Employee> getAllEmployeesByS();
}
