package com.interviewpre.collections;

import java.util.LinkedList;

public class LinkedListExample {
        public static void main(String[] args) {
			LinkedList<String> fruits=new LinkedList<>();
			fruits.add("mango");
			fruits.add("Apple");
			fruits.add("orange");
			fruits.add("watermelon");
			
			System.out.println(fruits);
			fruits.addFirst("Strawberry");
			System.out.println(fruits);
			fruits.remove(2);
			System.out.println(fruits);
		}
}
