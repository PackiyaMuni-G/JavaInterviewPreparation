package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleFilter {

	public static void main(String[] args) {
	List<Integer> IntList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,15,23,30);
	List<Integer> DiviFilter = IntList.stream()
	.filter(s-> s % 3 == 0 && s % 5 == 0)
	.collect(Collectors.toList());
	System.out.println(DiviFilter);
	}

}
