package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Divisiblefive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 7, 10, 13, 15, 20, 23, 26, 30);
        List<Integer> collect = list.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
        System.out.print(collect);

    }
}
