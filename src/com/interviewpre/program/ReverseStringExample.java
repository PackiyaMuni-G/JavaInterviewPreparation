package com.interviewpre.program;

public class ReverseStringExample {

	public static void main(String[] args) {
		String name="muni";
//	
//		String reverseName="";
//		char word;
//		for(int i=name.length()-1;i>=0;i--) {
//			 word = name.charAt(i);
//			          reverseName=word+reverseName;
//		}
//	   System.out.println(reverseName);   
		
		char[] charArray = name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
	}

}
