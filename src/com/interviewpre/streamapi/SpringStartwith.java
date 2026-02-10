package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpringStartwith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
        List<String> a = list.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(a);

    }
}
