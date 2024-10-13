package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 List<Integer> IntegerList = Arrays.asList(1,2,4,3,5,9,7,5,2);
		 List<Integer> collect = IntegerList.stream()
		  .distinct().collect(Collectors.toList());
		 System.out.println(collect);
		

	}

}
