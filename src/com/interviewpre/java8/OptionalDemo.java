package com.interviewpre.java8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[]words=new String[10];
                Optional<String> checkNuLL = Optional.ofNullable(words[5]);
                if(checkNuLL.isPresent()) {
                	String lowerCase = words[5].toLowerCase();
                	System.out.println(lowerCase);
                }
                else
                	 System.out.println("word is null");

	}

}
