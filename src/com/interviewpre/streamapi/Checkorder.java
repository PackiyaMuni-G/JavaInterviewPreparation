package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Checkorder {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(1,2,3,5,4);
		boolean equals = Intlist.stream()
		.sorted()
		.collect(Collectors.toList())
		.equals(Intlist);
		System.out.println("is it asce order:"+equals);
	}

}
