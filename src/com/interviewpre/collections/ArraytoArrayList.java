package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayList {
 public static void main(String[] args) {
	ArrayList<Integer> Al=new ArrayList<>();
	Al.add(100);
	Al.add(200);
	Al.add(300);
	System.out.println(Al);
	Integer[] array = Al.toArray(new Integer[0]);
	System.out.println(Arrays.toString(array));
}
}
