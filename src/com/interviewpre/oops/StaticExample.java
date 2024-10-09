package com.interviewpre.oops;




class Parent{
	static void display() {
		System.out.println("iam parent");
	}
}
class Child extends Parent{
	static void display() {
		System.out.println("iam child");
	}
}




public class StaticExample {
public static void main(String[] args) {
	Parent obj=new Child();
	obj.display();
}
}
