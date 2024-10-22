package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SumofInt {

	public static void main(String[] args) {
	List<Integer> Intlist = Arrays.asList(1,14,5,6,7);
	 int sum = Intlist.stream()
	 .mapToInt(Integer::intValue)
//	 .reduce(0,(a,b)-> a+b) 
	 .sum();
System.out.println("total :" + sum);
	 

	}

}
