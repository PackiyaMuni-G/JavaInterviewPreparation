package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prime {

	public static void main(String[] args) {
		 List<Integer> IntList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		  List<Integer> collect = IntList.stream()
		 .filter(Prime::isPrime) 
		 .collect(Collectors.toList());
		 System.out.println(collect);
		 
	}
	public  static boolean isPrime(int n) {
		 if(n<=1) {
			return false;
		 }
			 for (int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					return false;
				}
				
			}
			 return true;
			
		 }
	

}
