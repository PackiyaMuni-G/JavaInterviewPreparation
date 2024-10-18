package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class CheckStringLength {

	public static void main(String[] args) {
		List<String> Stringlist = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		boolean count = Stringlist.stream()
		.map(String::length)
		.distinct()
		.count()==1 ;
		System.out.println("All elements have the same length :" + count);

	}

}
