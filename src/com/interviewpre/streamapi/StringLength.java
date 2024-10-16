package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {

	public static void main(String[] args) {
		List<String> StringList = Arrays.asList("Apple","banana","kiwi","orange");
		int minLength=5;
		List<String> resString = StringList.stream()
		.filter(s->s.length() < minLength)
		.collect(Collectors.toList());
		System.out.println(resString);
		 

	}

}
