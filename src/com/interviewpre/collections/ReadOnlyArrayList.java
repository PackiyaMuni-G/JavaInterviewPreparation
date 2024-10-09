package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {
	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<>();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('B');
		
		List<Character> unmodifiableList = Collections.unmodifiableList(al);
		System.out.println("unmodifiableList before add " + unmodifiableList);
		try {
			System.out.println("\nAttempting to add element to the ReadOnly ArrayList");
	        unmodifiableList.add('D');
		} catch (Exception e) {
		 System.out.println("Exception caught: Cannot modify an unmodifiable list");
		}
	
        System.out.println("unmodifiableList after add " + unmodifiableList);
	}

}
