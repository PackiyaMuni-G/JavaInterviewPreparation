package com.interviewpre.streamapi;

import java.util.*;

public class FindSecondLargest {
    public static void main(String[] args) {

//        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
//        Optional<Integer> secondLargest = Arrays.stream(numbers)
//                .boxed()
//                .sorted((a,b) -> b - a)
//                .skip(1)
//                .findFirst();
        List<Integer> list = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        Optional<Integer> secondLargest = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();


        System.out.println(secondLargest.isPresent()?secondLargest.get():"no");
    }
}
