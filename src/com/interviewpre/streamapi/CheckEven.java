package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;


public class CheckEven {

	public static void main(String[] args) {
	List<Integer> intlist = Arrays.asList(2,4,6,8);
 boolean allMatch = intlist.stream()
	.allMatch(n->n%2==0);
 System.out.println(allMatch);

	}

}
