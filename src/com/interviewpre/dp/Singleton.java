package com.interviewpre.dp;

import java.security.SignatureException;

public class Singleton {
	private static Singleton s=null;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		 if(s==null) {
			s=new Singleton(); 
		 }
		 return s;
	}

	public static void main(String[] args) {
	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();
	if(s1==s2) {
		System.out.println(s1+" "+s2);
	}
	Pattern pattern = new Pattern();
	pattern.print();
	}
	

}
class Pattern{
	void print() {
		       Singleton s = Singleton.getInstance();   
		       System.out.println(s);
	}
}

