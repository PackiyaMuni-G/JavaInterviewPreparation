package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingPrefix {

	public static void main(String[] args) {
	  List<String> StringList = Arrays.asList("apple","banana","aws","kiwi");
	  String prefix="a";
	  List<String> Prefix = StringList.stream()
	        .filter(s -> s.startsWith(prefix))
	        .collect(Collectors.toList());
	  System.out.println(Prefix);
	}
	}
