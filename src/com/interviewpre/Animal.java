package com.interviewpre;

public class Animal {
	
	    Animal createAnimal() {
	        return new Animal();
	    }
	}

	class Dog extends Animal {
	    @Override
	    Dog createAnimal() {
	        return new Dog();  // Covariant return type
	    }
	}


