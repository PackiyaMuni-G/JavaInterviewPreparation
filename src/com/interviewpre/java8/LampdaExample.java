package com.interviewpre.java8;


interface functional{
	
	
	 abstract void abstractFun(int x,int y);
	default void NormalFun() {
		System.out.println("this is normal fun");
	}
}


public class LampdaExample {

	public static void main(String[] args) {
		
		functional fun= (int x,int y) -> {
			System.out.println(x+y);	
		};
				// TODO Auto-generated method stub
				
		
	
				// TODO Auto-generated method stub
				
		fun.abstractFun(5,4);	
		fun.NormalFun();
		
	}

}
