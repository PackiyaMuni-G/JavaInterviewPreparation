package com.interviewpre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6);
        List<Integer> uniqueList=list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueList);


    }
}
