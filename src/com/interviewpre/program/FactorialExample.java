package com.interviewpre.program;

public class FactorialExample {
public static void main(String[] args) {
	
	int n=5;
	
 System.out.println("factorial of " + n + " is :" +isFactorial(n));
		
}
public static int isFactorial(int n) {
	int fact=1;
	for (int i = 1; i <= n; i++) {
		fact=fact*i;
	}
	return fact;
		
	}
}

