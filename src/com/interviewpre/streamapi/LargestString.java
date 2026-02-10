package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LargestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "github", "javascript", "nodejs");  // 4,6,9,6
        Optional<String> largestString = list.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.print(largestString.isPresent()?largestString.get():"no found");

    }
}
