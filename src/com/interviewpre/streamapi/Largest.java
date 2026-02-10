package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Largest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45 , 12, 56, 15, 24, 75, 31, 89);
//        Optional<Integer> max = list.stream()
//                .max(Comparator.comparingInt(Integer::intValue));
        Optional<Integer> secondHighest = list.stream()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .skip(1)
                .findFirst();
        System.out.println(secondHighest.isPresent()?secondHighest.get():"none");
     //   System.out.println(max.isPresent()?max.get():"none");
    }
}
