package com.interviewpre;

	public class SleepExample {
	    public static void main(String[] args) {
	        System.out.println("Making coffee...");
	        System.out.println("1st thread");
	        
	        try {
	            // Simulate brewing time
	            Thread.sleep(5000); // Sleep for 3 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        System.out.println("Coffee is ready!");
	    }
	}


