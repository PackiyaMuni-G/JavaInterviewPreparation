package com.interviewpre.streamapi;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


public class distinctOdd {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(1,2,3,4,3,5,6,5,7,8,9,7);
		
	List<Integer> distinctOdd = Intlist.stream()
		.filter(n-> n % 2 != 0)
		 .distinct()
		 .collect(Collectors.toList());
	System.out.println(distinctOdd);

	}

}
