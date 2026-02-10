package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestSamllestDifferenece {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min().getAsInt();
        System.out.println(max - min);


    }
}
