package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMin {

	public static void main(String[] args) {
		List<Integer> Intlist = Arrays.asList(2,3,5,4,9,1,11,33,6);
		OptionalInt max = Intlist.stream().mapToInt(Integer::intValue).max();
				OptionalInt min = Intlist.stream().mapToInt(Integer::intValue).min();
				int diff=max.getAsInt()-min.getAsInt();
				
		System.out.println(diff);

	}

}
