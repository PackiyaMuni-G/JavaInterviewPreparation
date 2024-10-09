package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 {
	
	public Employee2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}










	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	


	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}
class Employee2Name implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class sortBySalary implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(), o2.getSalary());
	}
	
}
class sortByID implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}


public class ComparatorExample3 {

	public static void main(String[] args) {
		 List<Employee2> list=new ArrayList<>();
		 list.add(new Employee2(105,"ramesh",10000));
		 list.add(new Employee2(101,"mani",5000));
		 list.add(new Employee2(103,"sathya",35000));
		 list.add(new Employee2(104,"siva",13000));
		 list.add(new Employee2(102,"karthi",40000));
		 
	Collections.sort(list,new Employee2Name());
	for (Employee2 Employee2 : list) {
		System.out.println(Employee2);
	}
	Collections.sort(list,new sortBySalary());
	for (Employee2 Employee2 : list) {
		System.out.println(Employee2);
		
	}
	Collections.sort(list,new sortByID());
	for (Employee2 Employee2 : list) {
		System.out.println(
				
				
				);
	}
	}

}
