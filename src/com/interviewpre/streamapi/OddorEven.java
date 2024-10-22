package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddorEven {

	public static void main(String[] args) {
		List<Integer> intlist = Arrays.asList(2,3,4,5,6,7);
		Map<Boolean, List<Integer>> collect = intlist.stream()
	.collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(collect);
	}

}
