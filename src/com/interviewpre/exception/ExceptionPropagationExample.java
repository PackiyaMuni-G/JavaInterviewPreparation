package com.interviewpre.exception;

public class ExceptionPropagationExample {

    // Function that throws an exception
    static void functionC() {
        throw new ArithmeticException("An error occurred in functionC");
    }

    // Function that calls functionC and catches its exception
    static void functionB() {
   
            functionC();
        } 
    

    // Function that calls functionB
    static void functionA() {
    	try {
    		 functionB();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
       ;
    }

    // Main method that starts the execution
    public static void main(String[] args) {
        functionA();
    }
}
