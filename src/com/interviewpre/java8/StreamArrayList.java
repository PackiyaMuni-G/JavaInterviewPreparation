package com.interviewpre.java8;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamArrayList {

	public static void main(String[] args) {
	List<Integer> numbers=new ArrayList<>();
	numbers.add(21);
	numbers.add(10);
	numbers.add(3);
	numbers.add(14);
	numbers.add(32);
	System.out.println("before adding grace marks :" + numbers);
	

	List<Integer> Aftergrace = numbers.stream()
	.map(n -> n + 5 )
	.collect(Collectors.toList());
	
System.out.println(Aftergrace);
	}

}
