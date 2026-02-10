package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArraySum {
    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        OptionalDouble average = Arrays.stream(a)
                .average();

        System.out.println(average.isPresent()?average.getAsDouble():"none");

//                .sum();
      //  System.out.println(sum);

    }
}
