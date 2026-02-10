package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class ACount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Acne", "Aws", "Java", "Python");
        long a = list.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(a);


    }
}
