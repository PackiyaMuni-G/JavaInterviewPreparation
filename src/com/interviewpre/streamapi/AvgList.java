package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgList {

	public static void main(String[] args) {
	List<Integer> intlist = Arrays.asList(1,2,3,4,5);
	OptionalDouble average = intlist.stream()

	.mapToDouble(Integer::doubleValue)
	.average();
	System.out.println(average.isPresent()?average.getAsDouble():"N/A");

	}

}
