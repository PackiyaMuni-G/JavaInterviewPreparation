package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	public Employee(int id, String name, double salary) {
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
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(this.salary, o.salary);

}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}


public class Comparable3 {
 public static void main(String[] args) {
	 List<Employee> list=new ArrayList<>();
	 list.add(new Employee(105,"ramesh",10000));
	 list.add(new Employee(101,"mani",5000));
	 list.add(new Employee(103,"sathya",35000));
	 list.add(new Employee(104,"siva",13000));
	 list.add(new Employee(102,"karthi",40000));
	 
	 Collections.sort(list);
	 for(Employee emp:list) {
		 System.out.println(emp);
	 }
 }
	
}












