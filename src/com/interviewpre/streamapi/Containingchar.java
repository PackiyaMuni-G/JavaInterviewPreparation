package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Containingchar {

	public static void main(String[] args) {
	     List<String> Stringlist = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
	     char targetChar='a';
	     List<String> collect = Stringlist.stream()
	     .filter(s -> s.chars().filter(c-> c == targetChar).count()>=2)
	     .collect(Collectors.toList());
	     System.out.println(collect);
	}

}
