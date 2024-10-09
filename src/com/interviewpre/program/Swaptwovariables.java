package com.interviewpre.program;

import java.util.Scanner;

public class Swaptwovariables {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter a number x:");
		 x = sc.nextInt();
		 System.out.println("enter a number y:");
		 y=sc.nextInt();
	
		 System.out.println("Before Swapping\n " + "x : " + x + " y :" + y);
		          z=x;
		            x=y;
		              y=z;
//		     x=x+y;
//		     y=x-y;
//		        x=x-y;
		         System.out.println("After Swapping\n "+ "x : " + x + " y :" + y);

	}

}
