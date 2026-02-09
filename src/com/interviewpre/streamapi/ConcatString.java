package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatString {

	public static void main(String[] args) {
		List<String> StringList = Arrays.asList("lemon","mango","apple","kiwi","banana","cucumber","strawberry");
         String concatString = StringList.stream()
         
         
          
//           .map(s -> s.concat(""))
//           .forEach(System.out::print);
                  .collect(Collectors.joining());
         System.out.println(concatString);
               
	}

}
