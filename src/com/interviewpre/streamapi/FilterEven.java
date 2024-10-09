package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {

	public static void main(String[] args) {
	     List<Integer> list = Arrays.asList(2,4,3,5,9,7,6,1,8);
	     List<Integer> even = list.stream()
	     .filter(x -> x % 2 == 0)            //intermediate
	    .collect(Collectors.toList());              //terminal
	     System.out.println("even numbers : " + even);

	}

}
