package com.interviewpre.streamapi;

import java.util.function.BiFunction;

public class BifunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        int sum = add.apply(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);
    }
}
