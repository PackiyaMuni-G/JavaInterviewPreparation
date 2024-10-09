package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class Maximum {
        public static void main(String[] args) {
			List<Integer> List = Arrays.asList(2,3,6,19,12,5);
			int Maxi = List.stream()
			  .mapToInt(i -> i.intValue())     
			  .max().orElseThrow();
			System.out.println(Maxi);
		}
}
