package com.interviewpre.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpExceute {
    public static void main(String[] args) {
    //    Emp emp1 = new Emp("muni","gurumuni",8800.00);

        Emp[] employees={
                new Emp("Muni", "Gurumuni", 8800.00),
                new Emp("Arun", "Kumar", 12000.00),
                new Emp("Priya", "Ravi", 15000.00),
                new Emp("Karthik", "Selvam", 10000.00)
        };

        OptionalDouble average = Arrays.stream(employees)
                .mapToDouble(Emp::getSalary)
                .average();
        System.out.println(average.isPresent()?average.getAsDouble():"none");


//        Optional<Emp> highestSalary = Arrays.stream(employees)
//                .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
//                .findFirst();
//        System.out.println(highestSalary.isPresent()?highestSalary.get():"none");

        Optional<Emp> max = Arrays.stream(employees)
                .max(Comparator.comparingDouble(Emp::getSalary));
        System.out.println(max.isPresent()?max.get():"not found");


        List<String> firstNames = Arrays.stream(employees)
                .map(e -> e.getFirstName())
                .collect(Collectors.toList());
        for(String name:firstNames){
            System.out.println(name);
        }

        Optional<String> first = Arrays.stream(employees)
                .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
                .skip(1)
                .map(Emp::getFirstName)
                .findFirst();
        System.out.println(first.isPresent()? "2nd highest" + first.get():"none");

         Arrays.stream(employees
                )
                .sorted(Comparator.comparingDouble(Emp::getSalary))
                .map(Emp::getFirstName)
                .forEach(e -> System.out.println(e));

    }
}
