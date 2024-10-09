package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncArrayList {
	public static void main(String[] args) {
	
		
		ArrayList<String> al=new ArrayList<>();
		al.add("muni");
		al.add("guru");
		System.out.println(al);
		List<String> synchronizedList = Collections.synchronizedList(al);
		synchronized (synchronizedList) {
			for(String element:synchronizedList) {
				System.out.println(element);
			}
			
		}
	
	}

}
