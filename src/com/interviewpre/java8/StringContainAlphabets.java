package com.interviewpre.java8;

import java.util.function.Predicate;

public class StringContainAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Hel2lo";
	
	
	Predicate<String> obj=s->s.chars().allMatch(Character::isLetter);
	
	
	if (obj.test(str) ){
		System.out.println("it will contain only alphabets");
	} else {
         System.out.println("it contain non alphabet");
	}
	
			
			
			
			

	}

}
