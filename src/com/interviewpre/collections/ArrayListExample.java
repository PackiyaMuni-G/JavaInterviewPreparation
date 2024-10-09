package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
public static void main(String[] args) {
	Integer[] num= {10,20,30};
	
	ArrayList<Integer> newAl=new ArrayList<Integer>(Arrays.asList(num));
	System.out.println(newAl);
	int size = newAl.size();
	System.out.println(size);
	
	
}
}
