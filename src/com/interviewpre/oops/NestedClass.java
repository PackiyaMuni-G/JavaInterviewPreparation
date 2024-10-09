package com.interviewpre.oops;



interface Vehicle{
	class Engine{
		
		public void doSomething() {
			
           System.out.println("Engine starts");
	}
}


public class NestedClass {
	public static void main(String[] args) {
		Vehicle.Engine engine=new Engine();
		engine.doSomething();
	}
		
	}
	
}

