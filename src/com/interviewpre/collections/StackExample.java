package com.interviewpre.collections;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> books=new Stack<>();
		books.add("Book A");
		books.add("Book B");
		books.add("Book C");
		System.out.println(books);
		 System.out.println(books.capacity());
		 books.push("Book D");
		 System.out.println(books);
		System.out.println(books.peek());
		books.pop();
		System.out.println(books);
		System.out.println(books.isEmpty());
		books.pop();
		System.out.println(books);
		books.pop();
		System.out.println(books);
		books.pop();
		System.out.println(books.isEmpty());
		
	}

}
