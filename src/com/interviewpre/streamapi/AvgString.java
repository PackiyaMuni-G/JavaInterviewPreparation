package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
        OptionalDouble average = list.stream()
                .mapToDouble(String::length)
                .average();
        System.out.println(average.isPresent()?average.getAsDouble():"none");

    }
}
