package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {4, 5, 6, 7, 8};
        List<Integer> collect = Arrays.stream(arr1)
                .filter(Arrays.asList(arr2)::contains)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
