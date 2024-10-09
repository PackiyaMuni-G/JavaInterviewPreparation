package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class LongestString {

	public static void main(String[] args) {
	 List<String> StringList = Arrays.asList("mumbaiindians","royalchallengersbangalore","chennaisuperkings");
//	  Optional<String> LongestString = StringList.stream()
//	   .reduce((current, next) ->
//	   current.length() > next.length() ? current : next
//	   );
//	  LongestString.ifPresentOrElse(
//			  str -> System.out.println(str),
//	    		()-> System.out.println("no found")
//	    		);
			       Optional<String> LongestString = StringList.stream()
			       .max((str1,str2)-> str1.length()- str2.length() );
	System.out.println(LongestString.isPresent() ? LongestString.get(): "N/A");
	    		
	}
	

}
