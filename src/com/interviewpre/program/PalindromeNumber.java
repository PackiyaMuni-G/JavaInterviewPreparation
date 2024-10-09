package com.interviewpre.program;

public class PalindromeNumber {

	public static void main(String[] args) {
		boolean isPalindrome=true;
		int n=1211;
		
		checkPalin(n);

	}
	public static void checkPalin(int n) {
		int reverseNumber=0,lastDigit;
		int originalValue=n;
		
		     while(n!=0) {
		    	 lastDigit=n%10;
		    	 reverseNumber=reverseNumber*10+lastDigit;
		    	 n = n/10;
		     }
		     if(originalValue==reverseNumber) {
		    	 System.out.println(originalValue+" is a palindorme");
		     }
		     else
		    	
			    	 System.out.println(originalValue+" is not a palindorme");
			     
	}

}
