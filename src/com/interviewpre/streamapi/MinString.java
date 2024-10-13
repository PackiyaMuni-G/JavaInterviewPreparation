package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinString {

	public static void main(String[] args) {
	  List<String> ListString = Arrays.asList("apple","banana","mango","orange","kiwi");
	              Optional<String> min = ListString.stream()
	              .min(Comparator.comparingInt(String::length));
	            System.out.println(min.orElse(null));    
	  

	}

}
