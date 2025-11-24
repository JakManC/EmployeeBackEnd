package com.sundarMan.EmployeeBackEnd.repos;

import com.sundarMan.EmployeeBackEnd.Models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
}
