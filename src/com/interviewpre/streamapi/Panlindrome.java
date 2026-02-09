package com.interviewpre.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Panlindrome {
	public static void main(String[] args) {
		List<String> Stringlist = Arrays.asList("apple", "banana", "kiwi", "banana", "apple");

		List<String> strings = Stringlist;
		IntStream.range(0, strings.size());

	}
}