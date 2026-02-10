package com.interviewpre.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeat
{
    public static void main(String[] args) {
        String str="Javak";
        IntStream chars = str.chars();
        LinkedHashMap<Character, Long> freqMap = chars.mapToObj(c -> (char) c)    //j-1 a-2 v-1 k-1
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
 System.out.println("linkedHashmap " + freqMap);
//        Map<Character, Long> freqMap = chars.mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println( "hashmap " + freqMap);
        Optional<Character> first = freqMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first.isPresent()?first.get():"no found");

        //System.out.println(first.isPresent()?first:"none");



    }
}

