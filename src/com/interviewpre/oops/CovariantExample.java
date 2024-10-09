package com.interviewpre.oops;





class Animal1{
	public Animal1 makeSound() {
		  return new Animal1();
	}
	 public String toString() {
	        return "Animal1 sound";
	    }
	}
	

 class Cat extends Animal1{
    public Cat makeSound() {
		// TODO Auto-generated method stub
	return new Cat();
	}
    public String toString() {
        return "dog sound";
    }

	 
 }

public class CovariantExample {
public static void main(String[] args) {
	Animal1 ani=new Animal1();
	Cat cat=new Cat();
	System.out.println(ani.makeSound());
	System.out.println(cat.makeSound());
	
}
}
