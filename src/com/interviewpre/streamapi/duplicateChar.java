package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateChar {

	public static void main(String[] args) {
	List<String> StringList = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
	List<String> duplicateChar = StringList.stream()
	.filter(s->s.length() != s.chars().distinct().count())
	.collect(Collectors.toList());
	System.out.println(duplicateChar
			);
	

	}

}
