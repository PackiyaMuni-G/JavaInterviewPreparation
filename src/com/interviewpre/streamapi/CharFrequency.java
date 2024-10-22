package com.interviewpre.streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
;

public class CharFrequency {

	public static void main(String[] args) {
	String input="java";
	 Map<Integer, Long> freq = input.chars()
			.mapToObj(c -> c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(freq);

	}

}
