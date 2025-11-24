package com.sundarMan.EmployeeBackEnd.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private String id;

    private String firstName;

    private String fatherName;

    private String surName;

}
