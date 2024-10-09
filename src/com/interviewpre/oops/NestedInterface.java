package com.interviewpre.oops;


class Car{
	interface Engine {
		void doSomething();
	}
}

class Supercar implements Car.Engine{
	public void doSomething() {
		System.out.println("super car");
	}
}


public class NestedInterface {
	public static void main(String[] args) {
		      Car.Engine obj=new Supercar();
		      obj.doSomething();
		      
	}

}
