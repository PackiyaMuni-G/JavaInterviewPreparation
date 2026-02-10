package com.interviewpre.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumofInteger {
    public static void main(String[] args) {
        int n=15623;
        Integer Sum = Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(Sum);

    }
}
