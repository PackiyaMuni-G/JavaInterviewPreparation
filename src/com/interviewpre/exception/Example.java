package com.interviewpre.exception;

public class Example {
	void methodB() throws ArithmeticException {
		int a=4/0;
	}
	
	void methodA() {
		methodB();
	}
	
	
	public static void main(String[] args) {
		Example e=new Example();
		e.methodA();
	}

}
