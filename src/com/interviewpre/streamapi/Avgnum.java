package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Avgnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> listIntegers = Arrays.asList(2,5,3,7,3);
 OptionalDouble average = listIntegers.stream()
      .mapToDouble(Integer::doubleValue)
  .average();
 System.out.println(average.isPresent() ? average.getAsDouble() : "N/A");
	}

}
