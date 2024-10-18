package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqInt {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		Map<Integer, Long> freq = Intlist.stream()
		.collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println("Frequency of each element:"+ freq);
		
	
		
	}

}
