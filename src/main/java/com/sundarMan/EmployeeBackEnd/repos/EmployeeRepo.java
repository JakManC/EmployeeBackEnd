package com.sundarMan.EmployeeBackEnd.repos;

import com.sundarMan.EmployeeBackEnd.Models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
    Optional<Employee> findByFirstName(String firstName);
}
