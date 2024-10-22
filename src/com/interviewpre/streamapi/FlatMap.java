package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
	List<List<String>> listoflist = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("c","d"));
	List<String> listofLists = listoflist.stream()
	.flatMap(Collection::stream)
	.collect(Collectors.toList());
	System.out.println(listofLists);
	
	}

}
