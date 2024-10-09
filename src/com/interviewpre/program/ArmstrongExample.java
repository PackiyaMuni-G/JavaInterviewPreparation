package com.interviewpre.program;

public class ArmstrongExample {

	public static void main(String[] args) {
	 int c=0,temp ,n=153;
	 temp=n;
	 while(n !=0) {
		 int a=n%10;
		  n=n/10;
		 c= c+(a*a*a);
	 }
         if(temp ==c) {
        	 System.out.println(temp + " is a palindrome");
         }
         else
        	 System.out.println(temp+ " is not planidrome");
	}

}
