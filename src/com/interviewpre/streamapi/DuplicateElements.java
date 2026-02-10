package com.interviewpre.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "java", "node", "dotnet", "c", "java");
        HashSet<String> hs = new HashSet<>();
        List<String> duplicate = list.stream()
                .filter(s -> !hs.add(s))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicate);


       // System.out.println(strings);
//        Map<String, Long> freqMap = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        List<String> collect = freqMap.entrySet().stream()
//                .filter(e -> e.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());


      //  System.out.println(collect);
     
        
        

    }
}
