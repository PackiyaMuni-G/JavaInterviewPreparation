package com.interviewpre.program;

public class PanlindromExample {

	public static void main(String[] args) {
		boolean isPalindrome=true;
	String str="appa"; 
	 for(int i=0;i<str.length()/2;i++) {
		 if(str.charAt(i) != str.charAt(str.length()-1-i)) {
			 isPalindrome=false;
			 break;
		 }
		 
	 }
	 if(isPalindrome) {
		System.out.println(str + " is a palindrome"); 
	 }
	 else
		 System.out.println(str + " is not a palindrome"); 
	 }
	 


}
