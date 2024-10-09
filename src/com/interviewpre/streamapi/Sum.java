package com.interviewpre.streamapi;

import java.util.Arrays;

import java.util.List;



public class Sum {
 public static void main(String[] args) {
	
	           List<Integer> numbers = Arrays.asList(2,3,10,3,5);
	        		   int sum = numbers.stream()
	        		   .mapToInt(Integer::intValue)
	        		   .sum();
	        		System.out.println(sum);
	      
}


}