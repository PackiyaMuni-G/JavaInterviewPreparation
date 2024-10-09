package com.interviewpre.except;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
		int c=a/b;
		}
		catch(Exception e) {
			System.out.println("exception occured");
			
		}
		
		
		finally {
			System.out.println("operation finished");
		}
		
	}

}
