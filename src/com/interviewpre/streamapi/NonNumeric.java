package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NonNumeric {

	public static void main(String[] args) {
		 List<String> Strings = Arrays.asList("a1b2c3", "1a2b3c", "123abc");
		
		 Pattern pattern = Pattern.compile("[^0-9]");
 List<String> nonNumeric = Strings.stream()
 .map(s->pattern.matcher(s).replaceAll(""))
 .collect(Collectors.toList());
 System.out.println(nonNumeric);
	}

}
