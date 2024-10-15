package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class SquareInt {

	public static void main(String[] args) {
		List<Integer> IntList = Arrays.asList(1,2,3,4);
		List<Integer> SquareInt = IntList.stream()
		.map(n -> n * n)
		.collect(Collectors.toList());
		System.out.println(SquareInt);
		
	}

}
