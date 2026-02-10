package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementsArray {
    public static void main(String[] args) {
        int[] arr1={12,33,45,22,48,56};
        int[] arr2={13,33,45,29,46,53};
         Arrays.stream(arr1)
                .filter(i -> Arrays.stream(arr2).anyMatch(x -> x == i))
                .boxed()
                .forEach(i -> System.out.println(i));

      //  System.out.println(collect);



    }
}
