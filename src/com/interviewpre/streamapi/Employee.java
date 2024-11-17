package com.interviewpre.streamapi;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate birthDate;

    // Constructor
    public Employee(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getter for birthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // toString() method to print Employee details
    @Override
    public String toString() {
        return "Employee{name='" + name + "', birthDate=" + birthDate + "}";
    }
}
