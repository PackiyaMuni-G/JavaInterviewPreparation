package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class ContainxPrefix {
    public static void main(String[] args) {
        String target="ba";
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        boolean b = words.stream()
                .anyMatch(s -> s.startsWith(target));
        System.out.println(b);


    }
}
