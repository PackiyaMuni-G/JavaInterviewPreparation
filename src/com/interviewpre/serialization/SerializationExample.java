package com.interviewpre.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	int age;
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", password=" + password + "]";
	}
	String name;
	transient int password;
	public Person(int age, String name,int password) {
	
		this.age = age;
		this.name = name;
		this.password=password;
	}
}




public class SerializationExample {
public static void main(String[] args) {
	Person name = new Person(25,"muni",132323);
	ObjectOutputStream obj;
	try {
		obj = new ObjectOutputStream(new FileOutputStream("person.ser"));
		obj.writeObject(name);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	try {
		ObjectInputStream oip= new ObjectInputStream(new FileInputStream("person.ser"));
		try {
			Person deserial=(Person) oip.readObject();
			System.out.println("deserialized" + deserial);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
