package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OddSum {

	public static void main(String[] args) {
		List<Integer> IntList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
	int Oddsum = IntList.stream()
		
		.filter(n -> n % 2 !=0)
//		.reduce((a,b)-> a + b);
		.mapToInt(Integer::intValue)
		.sum();
		System.out.println(Oddsum);
	}

}
