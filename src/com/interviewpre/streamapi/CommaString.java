package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CommaString {

	public static void main(String[] args) {
	List<String> StringList = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
	String CommaSeparateString = StringList.stream()
	.collect(Collectors.joining(","));
	System.out.println(CommaSeparateString);
	}

}
