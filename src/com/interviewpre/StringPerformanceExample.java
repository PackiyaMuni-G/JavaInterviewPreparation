package com.interviewpre;

public class StringPerformanceExample {
	
	    public static void main(String[] args) {
	        int iterations = 100000;
	        long startTime, endTime;

	        // Using String
	        startTime = System.currentTimeMillis();
	        String str = "";
	        for (int i = 0; i < iterations; i++) {
	            str += "a";
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Time taken by String: " + (endTime - startTime) + "ms");

	        // Using StringBuffer
	        startTime = System.currentTimeMillis();
	        StringBuffer sbuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            sbuffer.append("a");
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + "ms");

	        // Using StringBuilder
	        startTime = System.currentTimeMillis();
	        StringBuilder sbuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            sbuilder.append("a");
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");
	    }
	}

