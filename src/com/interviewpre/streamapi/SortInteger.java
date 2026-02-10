package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortInteger {
    public static void main(String[] args) {
        List<Integer> Nums = Arrays.asList(5, 6, 3, 10, 2, 4, 8);
//        List<Integer> collect = Nums.stream()
//                .sorted(Comparator.comparingInt(Integer::intValue))
//
//                .collect(Collectors.toList());;
//        System.out.println(collect);
        Optional<Integer> max = Nums.stream()
                .min(Comparator.comparingInt(Integer::intValue));
        System.out.println(max.isPresent()?max.get():"not found");


    }
}
