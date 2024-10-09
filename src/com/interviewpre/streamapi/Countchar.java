package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class Countchar {

	public static void main(String[] args) {
	  List<String> list = Arrays.asList("apple","banana","orange","graph");
	  CharSequence searchChar="a";
	  long count = list.stream()
	  .filter(str-> str.contains(searchChar))
	  .count();
	  
    System.out.println(count);
	}

}
