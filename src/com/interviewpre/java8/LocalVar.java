package com.interviewpre.java8;


@FunctionalInterface
interface Local{
	int calc(int n);
}


public class LocalVar {

	public static void main(String[] args) {
		int num=10;
		Local l=(n)->{
			int  value=n+num;
              return value;
		};
		
		
		
	System.out.println(l.calc(5));

	}

}
