package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("HELLO", "World", "JAVA", "Programming");
        List<String> collect = words.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
