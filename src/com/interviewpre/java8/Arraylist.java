package com.interviewpre.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		  List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
		  
		  Collections.sort(list,(a,b)-> b.compareTo(a));
		  list.forEach(a-> System.out.println(a));


	}

}
