package com.interviewpre.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
	al.add("A");
	al.add("B");
	al.add("C");
	Iterator<String> iterator = al.iterator();
	while(iterator.hasNext()) {
		String value = iterator.next();
		if(value.equals("B")) {
			al.remove(value);
		}
	}
	System.out.println(al);
}
}
