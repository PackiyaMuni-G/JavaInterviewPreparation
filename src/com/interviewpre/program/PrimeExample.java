package com.interviewpre.program;

public class PrimeExample {

	public static void main(String[] args) {
		int n=1;
	boolean isPrime=true;
	
	if(n<=1) {
		System.out.println(n +" is not a prime");
		return ;
	}
      for(int i=2;i<=Math.sqrt(n);i++) {
    	  if(n%i==0) {
    		  isPrime=false;
    		  break;
    	  }
      }
      if(isPrime) {
    	  System.out.println(n+ " is a prime");
      }
      else 
    	  System.out.println(n+" is not a prime");
    
}
}