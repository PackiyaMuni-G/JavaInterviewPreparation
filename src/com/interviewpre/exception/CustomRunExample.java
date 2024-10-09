package com.interviewpre.exception;


class CustomRunException extends RuntimeException{

	public CustomRunException(String msg) {
		super(msg);
	}
	
	
}


public class CustomRunExample {

	public static void main(String[] args) {
	int age=13;
	
	try {
		checkAge(age);
	} catch (Exception e) {
	      System.out.println(e.getMessage());
	}
	
	
	
	
	}

	public static void checkAge(int age) {
		if(age < 18) {
			throw new CustomRunException("Hey this age is not valid");
		}
		else
			System.out.println("Age is valid");

	}

}
