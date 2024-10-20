package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class KthSmall {

	public static void main(String[] args) {
	List<Integer> intList = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
	int k=3;
	Optional<Integer> first = intList.stream().sorted()
	.skip(k-1)
	.findFirst();
	System.out.println(first.isPresent()?first.get():"N/A");
	}

}
