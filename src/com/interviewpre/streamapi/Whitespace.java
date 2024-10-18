package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Whitespace {

	public static void main(String[] args) {
		   List<String> strings = Arrays.asList("apple", "ba nana", "kiwi", "oran ge", "pear");
		    List<String> Strings = strings.stream()
		  .map(s-> s.replaceAll("\\s", ""))
		   .collect(Collectors.toList());
		    System.out.println(Strings);
		

	}

}
