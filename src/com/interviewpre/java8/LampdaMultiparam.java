package com.interviewpre.java8;

@FunctionalInterface
interface func1{
	int operation(int a,int b);
	
}



public class LampdaMultiparam {

	public static void main(String[] args) {
		 func1 add=(int a,int b) -> a+b;
		 func1 multiply=(int a,int b)-> a *b;
		 
		System.out.println(add.operation(2, 3));
		System.out.println(multiply.operation(3, 5));

	}

}
