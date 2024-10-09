package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample2 {

	public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	name.add("muni");
	name.add("gurumuni");
	name.add("theivanai");
	name.add("muniselvam");
	
	Iterator<String> iterator = name.iterator();
	
	while(iterator.hasNext()) {
		String n = iterator.next();
		
		name.add("newmemeber");
		
	}
           System.out.println(name);
	}

}
