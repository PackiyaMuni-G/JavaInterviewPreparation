package com.interviewpre.trickey;

public class Stringreverse {

	public static void main(String[] args) {
		String name="muni";
	System.out.println(reverseString(name));
		}
		 public static String reverseString(String str) {
			 StringBuilder reverseString = new StringBuilder();
				for (int i = str.length()-1; i >= 0; i--) {
			        reverseString.append(str.charAt(i));
					
		 }
		return reverseString.toString();

	}

}
