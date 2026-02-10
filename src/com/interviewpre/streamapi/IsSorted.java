package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsSorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        boolean equals = list.stream()
                .sorted()
                .toList()
                .equals(list);
        System.out.println(equals);

    }
}
