package com.interviewpre.streamapi;

import java.util.stream.IntStream;

public class FirstTen {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 10)
                .sum();
        System.out.println(sum);

    }
}
