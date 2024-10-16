package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

public class IntersectionString {

	public static void main(String[] args) {
		List<List<String>> list1 = Arrays.asList(Arrays.asList("apple", "banana", "kiwi", "orange", "pear"));
		List<String> list2 = Arrays.asList("banana","graph","watermelon","kiwi");
		 Stream<String> filter = list1.stream()
		 .flatMap(List::stream)
		 .filter(list2::contains);
		filter.forEach(System.out::println);
//		filter.forEach(x -> System.out.println(x));
	
		

	}

}
