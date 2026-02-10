package com.interviewpre.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStringBylength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "java",
                "c",
                "python",
                "go",
                "node",
                "js"
        );

        TreeMap<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length,() -> new TreeMap<>(Comparator.reverseOrder()),Collectors.toList()));
        ;
        System.out.println(collect);


    }
}
