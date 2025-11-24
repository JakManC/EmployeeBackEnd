package com.sundarMan.EmployeeBackEnd.Models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {
    @Id
    private String id;
    @Indexed(unique = true)
    @NotBlank(message = "FirstName Not Be Empty...")
    private String firstName;

    private String fatherName;

    private String surName;

}
