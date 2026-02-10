package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElement {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 2, 4, 2, 5, 3};
        Object comparingByValue;
        Optional<Map.Entry<Integer, Long>> max = Arrays.stream(numbers)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max.isPresent()?max.get():"none");
    }
}
