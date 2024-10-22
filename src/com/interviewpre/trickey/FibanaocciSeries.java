package com.interviewpre.trickey;

public class FibanaocciSeries {

	public static void main(String[] args) {
	int n=5;
	fibanocci(n);
	}
	public static void fibanocci(int n) {
		int a=0,b=1;
		for (int i = 2; i < n; i++) {
			System.out.println(a + " " + b + " ");
			int c=a + b;
			System.out.println(c+ " ");
			a=b;
			b=c;
		}
	}

}
