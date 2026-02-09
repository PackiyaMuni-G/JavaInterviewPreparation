package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewSum {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "ab", "abc", "abcd", "abcde");
        List<String> collect = strings.stream()
                .filter(s -> s.length() >= 3)
                .collect(Collectors.toList());
System.out.println(collect);
    }
}
