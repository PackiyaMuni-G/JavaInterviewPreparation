package com.interviewpre.program;

public class FinalReverseWithoutUsingStringMethods {
public static void main(String[] args) {
	String str="Apple";
	StringBuilder sb = new StringBuilder();
	StringBuilder append = sb.append(str);
	StringBuilder reverse = append.reverse();
	System.out.println(reverse);
		
}
}
