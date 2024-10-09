package com.interviewpre.collections;



public class LinkedHashSet {

	public static void main(String[] args) {
	
		java.util.LinkedHashSet<String> fruits=new java.util.LinkedHashSet<>();
		 fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Apple");
	        System.out.println(fruits);
	}

}
