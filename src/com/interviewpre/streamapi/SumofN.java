package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumofN {

	public static void main(String[] args) {
		List<Integer> IntList = Arrays.asList(1,2,3,4);
		 Integer combine = IntList.stream()
		   .reduce(1,(a,b)-> a * b);
		 System.out.println(combine);

	}

}
