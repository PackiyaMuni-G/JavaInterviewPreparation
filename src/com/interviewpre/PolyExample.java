package com.interviewpre;


class Parent{
	static void display() {
		System.out.println("parent static");
	}
}
class Child extends Parent{
	static void display() {
		System.out.println("child static");
	}
}



public class PolyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent.display();
		Child.display();
		
		Parent child=new Child();       
		child.display();
	}

}
