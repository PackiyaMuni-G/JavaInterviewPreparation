package com.interviewpre.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LampdaCollections {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();


	al.add("muni");
	al.add("gurumuni");
	al.add("muniselvam");
	al.add("theivanai");
	
	Collections.sort(al, (a,b)-> (a.length()>b.length())?-1:(a.length()>b.length())?1:0);
	
//	
//	for (String va : al) {
//		System.out.println(va);
//	}
	
	
//	al.forEach(n -> System.out.println(n));
	al.forEach(a -> System.out.println(a));
	
	
	
}
}
