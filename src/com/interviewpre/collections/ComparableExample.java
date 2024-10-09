package com.interviewpre.collections;


import java.util.TreeSet;

class Person implements Comparable<Person>{

	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}



public class ComparableExample {
public static void main(String[] args) {
	TreeSet<Person> people=new TreeSet<>();
	people.add(new Person(25,"muni"));
	people.add(new Person(16,"ken"));
	people.add(new Person(40,"vj"));
	people.add(new Person(60,"raman"));
	for(Person p:people) {
		System.out.println(p);
	}
	

}
}
