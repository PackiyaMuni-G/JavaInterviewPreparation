package com.interviewpre.trickey;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
	int[] arr= {1,2,4,2,5,6};
	findDuplicate(arr);
	}
	public static void findDuplicate(int [] n) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : n) {
			if(!hashSet.add(num)) {

				System.out.println("duplicate found"+ num);
			}
			
		}
	}

}
