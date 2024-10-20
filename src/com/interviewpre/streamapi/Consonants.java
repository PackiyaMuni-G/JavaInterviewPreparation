package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Consonants {

	public static void main(String[] args) {
		List<String> Stringlist = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		Map<String, Long> freqMap = Stringlist.stream()
		.collect(Collectors.toMap(s->s, 
				s->s.chars().filter( c->"BCDFGHJKLMNPQRSTUWXYZbcdfghjklmnpqrstuwxyz".indexOf(c) !=-1).count()));
		System.out.println(freqMap);
		long maxConstanont = freqMap.values()
		.stream().mapToLong(Long::longValue).max().orElse(0);
		 List<String> maxConstanotString = freqMap.entrySet().stream()
		 .filter(entry-> entry.getValue()==maxConstanont)
		 .map(Map.Entry::getKey)
		 .collect(Collectors.toList());
		 System.out.println(maxConstanotString);
	}

}
