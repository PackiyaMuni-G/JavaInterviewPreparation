package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlbhaSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("c", "a", "c", "b");
        List<String> collect = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
