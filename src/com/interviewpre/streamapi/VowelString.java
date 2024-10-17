package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelString {

	public static void main(String[] args) {
		List<String> StringList = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai");
		List<String> vowelString = StringList.stream()
		.filter(s->s.matches("[aeiouAEIOU]+"))
		.collect(Collectors.toList());
		System.out.println(vowelString);

	}

}
