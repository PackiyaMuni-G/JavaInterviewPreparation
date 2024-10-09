package com.interviewpre;


	public class ArrayExample {
	    public static void main(String[] args) {
	        int n = 6;  // Size of the array is determined at runtime
	        int[] array = new int[n];  // Array creation happens here

	        // Filling the array with values
	        for (int i = 0; i < n; i++) {
	            array[i] = i * 2;
	        }

	        // Printing the array
	        for (int i = 0; i < n; i++) {
	            System.out.println("Element at index " + i + ": " + array[i]);
	        }
	    }
	}



