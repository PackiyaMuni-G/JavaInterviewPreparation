package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> collect = list.stream()
                .filter(s -> !s.isEmpty())
                .map( s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
