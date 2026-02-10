package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] a={5, 1, 7, 3, 9, 6};

        int[] a1 = IntStream.range(0, a.length )
                .map(i -> a[a.length - 1 - i])
                .toArray();
        System.out.println(Arrays.toString(a1));



    }
}
