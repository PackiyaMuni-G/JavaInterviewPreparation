package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class MiniVowel {

	public static void main(String[] args) {
		List<String> StringList = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		Map<String, Long> freqmap = StringList.stream()
		.collect(Collectors.toMap(s ->s , 
		   s->s.chars().filter(c-> "AEIOUaeiou".indexOf(c) != -1).count()
		));
		System.out.println(freqmap);
		 long minVowel = freqmap.values().stream().mapToLong(Long::longValue).min().orElse(0);
		 List<String> minVowelString = freqmap.entrySet().stream()
		 .filter(entry-> entry.getValue().equals(minVowel))
		 .map(Map.Entry::getKey)
		 .collect(Collectors.toList());
		 System.out.println(minVowelString);
		 
	}

}
