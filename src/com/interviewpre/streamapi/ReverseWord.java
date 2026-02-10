package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String s="Java is fun";
        String[] split = s.split(" ");
        System.out.println(Arrays.toString(split));
        String collect = Arrays.stream(split)
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining( " "));
        System.out.println(collect);


    }
}
