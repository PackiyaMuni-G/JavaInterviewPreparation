package com.interviewpre.program;

public class FibanoacciSeriesExample {

	public static void main(String[] args) {
		int n=7;
		
		checkFibanocci(n);

	}
public static void checkFibanocci(int n){
	int n1=0,n2=1;
	for (int i = 0; i<
			n; i++) {
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	
 }
 

}
