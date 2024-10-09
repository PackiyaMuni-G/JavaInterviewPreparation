package com.interviewpre.oops;



class Superclass{
	 static void display() {
		 System.out.println("super");
	 }
}
class Subclass extends Superclass{
	static void display() {
		 System.out.println("sub class");
		 
	 }
}


public class MethodHiding {
	public static void main(String[] args) {
//		Superclass.display();
//		Subclass.display();
		Superclass obj1 = new Superclass();
		Subclass obj2 = new Subclass();  // Upcasting
		obj1.display();  // Outputs: Superclass display
		obj2.display();  // Outputs: Superclass display (not Subclass display)

	}
	  

}
