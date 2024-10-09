package com.interviewpre;



class Car implements Cloneable{
	String color;
	String model;
	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
	
	
	public void display() {
		System.out.println("Model: " + model + ", Color: " + color);
	}
}




public class CloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car Car1 = new Car("red","Audi");
		Car Car2=Car1.clone();
		Car2.color="blue";
		Car1.display();
		Car2.display();
	
	
	}

}
