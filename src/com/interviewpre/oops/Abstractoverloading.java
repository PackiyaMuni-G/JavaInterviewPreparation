package com.interviewpre.oops;



abstract class Animal{
	void Sound() {
		System.out.println("animal");
	}
}

class Dog extends Animal{
	public void Sound() {
		System.out.println("dog");
	}
}

public class Abstractoverloading {
 public static void main(String[] args) {
	 Animal dog=new Dog();
	 dog.Sound();
	
}
}
