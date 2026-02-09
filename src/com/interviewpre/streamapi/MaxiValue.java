package com.interviewpre.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxiValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        Optional<Integer> max = list.stream()
//                .max(Integer::compare);
//        System.out.println(max.isPresent()?max.get():"no found");
        Optional<Integer> first = list.stream()
                .sorted(Comparator.reverseOrder())  // 7 6 5 4 3 2 1
                .findFirst();
        System.out.println(first.isPresent()?first.get():"no found");
    }
}
