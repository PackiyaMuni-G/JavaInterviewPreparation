package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Median {

	public static void main(String[] args) {
		List<Integer> IntList = Arrays.asList(1,2,3,4,5,6);
	OptionalDouble average = IntList.stream()
		.mapToInt(Integer::intValue)
		.sorted()
         .skip((IntList.size()-1) / 2)
        .limit(IntList.size() % 2== 0 ? 2 : 1)
        .average();
	System.out.println(average.isPresent()?average.getAsDouble():"N/A");
         
          
            

		
	
		
		
		
		
	}

}
