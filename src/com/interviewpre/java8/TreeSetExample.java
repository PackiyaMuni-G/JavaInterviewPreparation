package com.interviewpre.java8;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		 TreeSet<Integer> h = 
                 new TreeSet<Integer>();
  h.add(850);
  h.add(235);
  h.add(1080);
  h.add(15);
  h.add(5);
  System.out.println("Elements of the TreeSet after" + 
                                  " sorting are: " + h);

	}

}
