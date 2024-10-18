package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Substring {

	public static void main(String[] args) {
		List<String> Stringlist = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		String substring="an";
		List<String> collect = Stringlist.stream()
		.filter(s->s.contains(substring))
		.collect(Collectors.toList());
		System.out.println(collect);

	}

}
