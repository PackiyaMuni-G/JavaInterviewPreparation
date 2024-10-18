package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinLength {

	public static void main(String[] args) {
		List<String> Stringlist = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		Optional<String> min = Stringlist.stream()
		.min(Comparator.comparingInt(String::length));
		System.out.println(min.orElse(null));
		
		
		

	}

}
