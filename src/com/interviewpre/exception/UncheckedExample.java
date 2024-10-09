package com.interviewpre.exception;

public class UncheckedExample {
public static void main(String[] args) {
	int a=12,b=4;
	try {
		int c=a/b;
		System.exit(0);

	} catch (Exception e) {
		System.out.println("arithematic exception occured");
	}
	finally {
		System.out.println("hey its finally block");
	}
	
}
}
