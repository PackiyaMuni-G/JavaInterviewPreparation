package com.interviewpre.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QuqueExample {
public static void main(String[] args) {
	Queue<String> name=new LinkedList<>();
	name.add("mi");
	name.add("csk");
	name.add("rcb");
	System.out.println(name.peek());
	System.out.println(name.poll());
	System.out.println(name);
}
}
