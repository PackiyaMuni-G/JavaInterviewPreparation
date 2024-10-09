package com.interviewpre.collections;

import java.util.HashMap;
import java.util.Objects;

public class HashMapExample {

	int age;
	String name;
@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapExample other = (HashMapExample) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
public static void main(String[] args) {
	
	HashMap<Integer,String> Subject=new HashMap<>();
	Subject.put(101, "Maths");
	Subject.put(102, "Science");
	Subject.put(103, "Bilogy");
	Subject.put(104, null);
	Subject.put(105, null);
	System.out.println(Subject);
}
}
