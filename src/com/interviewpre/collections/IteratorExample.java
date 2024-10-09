package com.interviewpre.collections;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
public static void main(String[] args) {
	List<Integer> numbers=new ArrayList<>();
	numbers.add(5);
	numbers.add(15);
	numbers.add(55);
	numbers.add(25);
//	System.out.println("numbers "+numbers);
	Iterator<Integer> iterator = numbers.iterator();
//	System.out.println(iterator);
	
	while(iterator.hasNext()) {
		Integer num = iterator.next();
		System.out.println("num " + num);
		if(num == 15) {
			iterator.remove();
		}

	}

	System.out.println("updatedlist "+numbers);
}
}
