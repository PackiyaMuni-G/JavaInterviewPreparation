package com.interviewpre.oops;





class Outer{
	 class inner{
		void display() {
			System.out.println("hi iam static inner class");
		}
	}
}
public class StaticInner {
  public static void main(String[] args) {
	             Outer out=new Outer();
	             Outer.inner in=out.new inner();
	              in.display();
	
}
}
