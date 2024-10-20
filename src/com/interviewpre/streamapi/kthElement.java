package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class kthElement {
public static void main(String[] args) {
	int k=3;
	List<Integer> Intlist = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
	Integer KthElement = Intlist.stream().sorted().distinct()
	.skip(k-1)
	.findFirst().orElse(null);
	System.out.println(KthElement);
	
	
}
}
