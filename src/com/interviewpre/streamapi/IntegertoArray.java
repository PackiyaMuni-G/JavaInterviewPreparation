package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class IntegertoArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Object[] array = list.stream()
                .toArray();

        System.out.println(Arrays.deepToString(array));

    }
}
