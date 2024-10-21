package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import java.util.stream.Collectors;

public class LowFreq {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		
		Map<Integer, Long> mapFreq = Intlist.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        long minFrequency =mapFreq.values().stream().mapToLong(Long::longValue).min().orElse(0);
        		List<Integer> elementsWithMinFrequency =	mapFreq.entrySet().stream()
        		.filter(entry->entry.getValue().equals(minFrequency))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        		
        		
        		
System.out.println(elementsWithMinFrequency);
	}

}
