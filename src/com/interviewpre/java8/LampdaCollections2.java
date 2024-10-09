package com.interviewpre.java8;

import java.util.ArrayList;
import java.util.List;

public class LampdaCollections2 {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();


		al.add(50);
		al.add(55);
		al.add(23);
		al.add(34);
		
		
//		al.forEach(n-> System.out.println(n));
		
		al.forEach(n->{
			if(n % 2 != 0)
				System.out.println(n);
		});
	}

}
