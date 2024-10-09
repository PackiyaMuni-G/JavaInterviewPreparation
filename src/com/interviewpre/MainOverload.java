package com.interviewpre;


	public class MainOverload {
	    // Standard main method recognized by JVM
	    public static void main(String[] args) {
	        System.out.println("Main method with String[] args");

	        // Calling overloaded main methods
	        main(10);
	        main("Hello, Java!");
	    }

	    // Overloaded main method 1
	    public static void main(int a) {
	        System.out.println("Overloaded main method with int: " + a);
	    }

	    // Overloaded main method 2
	    public static void main(String message) {
	        System.out.println("Overloaded main method with String: " + message);
	    }
	}


