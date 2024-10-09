package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Uppercase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("javascript","java","php");
		   
			List<String> uppercaseString = list.stream()
		       .map(String::toUpperCase)
//		         .forEach(System.out::println);
		       .collect(Collectors.toList());
			System.out.println(uppercaseString);
	}

}
