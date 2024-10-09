package com.interviewpre;


import java.util.Collections;

public class StringExample {
public static void main(String[] args) {
	
	 Integer a = 127;
     Integer b = 127;
     Integer c = 128;
     Integer d = 128;

     System.out.println(a == b);  // Line 1
     System.out.println(c == d);  // Line 2
     System.out.println(a.equals(b));  // Line 3
     System.out.println(c.equals(d));  // Line 4
}
}
