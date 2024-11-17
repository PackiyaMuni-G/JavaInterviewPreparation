package com.interviewpre.streamapi;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestEmployeeFinder {

    public static void main(String[] args) {
        // List of employees with birth dates
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", LocalDate.of(1985, 5, 15)),
                new Employee("Bob", LocalDate.of(1970, 8, 23)),
                new Employee("Charlie", LocalDate.of(1992, 3, 10)),
                new Employee("David", LocalDate.of(1980, 2, 19)),
                new Employee("Eve", LocalDate.of(1965, 7, 25))
        );

        // Find the oldest employee using min and comparing birth dates
        Optional<Employee> oldestEmployee = employees.stream()
                .min(Comparator.comparing(Employee::getBirthDate));

        // Output the oldest employee
        oldestEmployee.ifPresent(emp -> {
            System.out.println("The oldest employee is: " + emp);
        });
    }
}
