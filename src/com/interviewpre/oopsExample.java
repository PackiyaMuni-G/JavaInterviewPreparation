package com.interviewpre;


class Parent1{
	void show(int a) {
		System.out.println("Parent1 int called"+ a);
	}
	void show(String a) {
		System.out.println("Parent1 string is called" + a);
	}
}
class Child1 extends Parent1{
	@Override
	void show(int a) {
		System.out.println("Child1 int called" + a);
	}
}

public class oopsExample {
public static void main(String[] args) {
	Parent1 p=new Parent1();
	p.show(10);
	p.show("muni");
	Child1 Child1=new Child1();
	Child1.show(20);
	Child1.show("karthik");
	Parent1 pa=new Child1();
	pa.show(30);
	pa.show("siva");
}
}
