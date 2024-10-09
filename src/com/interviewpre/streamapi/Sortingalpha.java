package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortingalpha {

	public static void main(String[] args) {
	 List<String> StringList = Arrays.asList("lemon","mango","apple","kiwi","banana","cucumber","strawberry");
	 
      List<String> sortString = StringList.stream()
      .sorted()
      .collect(Collectors.toList());
      System.out.println(sortString);
	}

}
