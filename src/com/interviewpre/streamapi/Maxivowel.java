package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class Maxivowel {

	public static void main(String[] args) {
	List<String> Intlist = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
	
	Map<String, Long> freqMap = Intlist.stream().collect(Collectors.toMap(s ->s,
			s-> s.chars().filter(c -> "AEIOUaeiou".indexOf(c) !=-1).count()
			));
	System.out.println(freqMap);
	       long maxVowels= freqMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
	       
	       List<String> maxVowelsCount = freqMap.entrySet().stream()
	         .filter(entry -> entry.getValue() == maxVowels)
	         .map(Map.Entry::getKey)
	         .collect(Collectors.toList());
	       System.out.println(maxVowelsCount);
	      
	       
	}}

