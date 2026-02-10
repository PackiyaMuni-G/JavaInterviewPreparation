package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EVENODDSEPERATION {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);
        for ( Map.Entry<Boolean,List<Integer>> entry:collect.entrySet()){
            if(entry.getKey()){
                System.out.println("even " );

            }
            else
                System.out.println("odd");
            List<Integer> value = entry.getValue();
            System.out.println(value);

        }


    }
}
