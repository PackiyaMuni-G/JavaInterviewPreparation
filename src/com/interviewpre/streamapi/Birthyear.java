package com.interviewpre.streamapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Birthyear {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1994, 8, 14);
        System.out.println(birthdate);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        Period between = Period.between(birthdate, now);
        System.out.println(between.getYears());



    }
}
