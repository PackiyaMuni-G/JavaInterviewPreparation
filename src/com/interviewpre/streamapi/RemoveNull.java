package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {

	public static void main(String[] args) {
		List<String> StringList = Arrays.asList("apple", null, "banana", null, "kiwi", "orange", null, "pear");
		List<String> collect = StringList.stream()
	        .filter(s-> s != null)
	        .collect(Collectors.toList());
	        
	        
         System.out.println(collect);
	}

}
