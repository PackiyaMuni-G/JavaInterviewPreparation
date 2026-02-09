package com.interviewpre.streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNonRepeat {
    public static void main(String[] args) {
//        String input="apple";
//        HashMap<Character, Integer> freqMap = new HashMap<>();
//        char[] charArray = input.toCharArray();
//        System.out.println(charArray);
//        for (char c:charArray){
//            if (freqMap.containsKey(c)){
//                freqMap.put(c,freqMap.get(c)+1);
//            }else
//                freqMap.put(c,1);
//        }
//
//       System.out.println(freqMap);

        String input="java";
        IntStream chars = input.chars();
        Map<Character, Long> collect = chars.mapToObj(c -> (char) c)   // j-1 a-2 v-1
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Character> first = collect.entrySet()
                .stream()
                .filter(e -> e.getValue() != 1)
                .map(Map.Entry::getKey)
                .findFirst();


        System.out.println(first.isPresent()?first:"no found");

    }
}
