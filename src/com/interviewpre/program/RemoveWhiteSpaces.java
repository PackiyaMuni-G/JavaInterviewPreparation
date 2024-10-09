package com.interviewpre.program;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		 String str = "Hello   World  ! Welcome   to  Java";
//		 String replaceAll = str.replaceAll("\\s", "");
		 StringBuilder name = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(!Character.isWhitespace(charAt)) {
			name.append(charAt);
			}
		}
		System.out.println("original :"+str);
		System.out.println("replace :"+ name.toString());
	}

}
