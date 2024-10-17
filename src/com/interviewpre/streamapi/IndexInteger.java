package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;

public class IndexInteger {

	public static void main(String[] args) {
	List<Integer> IntList = Arrays.asList(1,2,4,7,8,9,6,10);
	int targetNumber=7;
	 int indexOf = IntList.indexOf(targetNumber);
	 System.out.println(indexOf);

	}

}
