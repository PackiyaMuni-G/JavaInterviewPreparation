package com.interviewpre.program;

import java.util.Arrays;

public class BubbleSortExample {
	
	
	public static void bubbleSort(int[] arr) {
		boolean swapped;
		int length = arr.length;
	for (int i = 0; i < length-1; i++) {
		swapped=false;
		for (int j = 0; j < length-1-i; j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped=true;
			}
			
		}
		if(!swapped) {
			break;
		}
	}
		
	}
	
	
	
	

	public static void main(String[] args) {
		 int[] array = {64, 34, 25, 12,44, 22, 11, 90};
      bubbleSort(array);
      System.out.println(Arrays.toString(array));
	}

}
