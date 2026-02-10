package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3 {
    public static void main(String[] args) {
        List<Integer> Nums = Arrays.asList(7, 4, 3, 6, 2, 11, 21, 12);
         Nums.stream()
                .sorted(Comparator.comparingDouble(Integer::intValue))
                 .skip(5)
                .forEach(System.out::println);



    }
}
