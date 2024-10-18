package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ModeInteger {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		Map<Integer, Long> frequencyMap = Intlist.stream()
		.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		long maxFrequency = frequencyMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
		
       List<Integer> modes = frequencyMap.entrySet().stream()
       .filter(s-> s.getValue() == maxFrequency)
       .map(Map.Entry::getKey)
       .collect(Collectors.toList());
       System.out.println(modes);
	}

}
