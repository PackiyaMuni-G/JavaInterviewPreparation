package com.interviewpre.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample2 {
public static void main(String[] args) {
	ConcurrentHashMap<Integer, String> Person=new  ConcurrentHashMap<>();
	Person.put(25, "muni");
	Person.put(30, "siva");
	Person.put(15, "guru");
	
	Iterator<Entry<Integer, String>> iterator = Person.entrySet().iterator();
	while(iterator.hasNext()) {
		Entry<Integer, String> next = iterator.next();
		System.out.println("next " + next.getKey() + " "+ next.getValue());
		Person.put(23, "selvam");
	}
	System.out.println(Person);
}
}
