package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringbyLength {

	public static void main(String[] args) {
		 List<String> Stringlist = Arrays.asList("lemon","mango","apple","kiwi","banana","cucumber","strawberry");
		 
		 List<String> Sortedlist = Stringlist.stream()
		 .sorted(Comparator.comparingInt(String::length))
		 .collect(Collectors.toList());
		 System.out.println(Sortedlist);

	}

}
