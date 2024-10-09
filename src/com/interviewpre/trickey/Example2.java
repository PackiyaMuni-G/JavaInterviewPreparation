package com.interviewpre.trickey;


class Test1{
	void method(Object o) {
		System.out.println("Object");
	}
	void method(String s) {
		System.out.println("String");
	}
}
public class Example2 {
public static void main(String[] args) {
	Test1 obj = new Test1();
	obj.method(obj);
}
}
