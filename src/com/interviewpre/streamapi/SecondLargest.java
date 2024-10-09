package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class SecondLargest {

	public static void main(String[] args) {
	List<Integer> IntegerList = Arrays.asList(1,4,33,17,12,5);
	 Optional<Integer> secondLargest = IntegerList.stream()
	  .sorted(Comparator.reverseOrder())
	  .skip(1).findFirst();
	 secondLargest.ifPresentOrElse(x -> System.out.println(x),() ->System.out.println());   //lampda expression
	 secondLargest.ifPresentOrElse(System.out::println,()->System.out.println("could not find 2nd largest"));            //method reference
	}

}
