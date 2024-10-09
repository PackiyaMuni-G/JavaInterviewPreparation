
package com.interviewpre.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CollectionExample {

	
	
public static void main(String[] args) {
	
	
	List<String> Al=new ArrayList<>();
	
	   List<String> synchronizedList = Collections.synchronizedList(Al);
	   synchronizedList.add("java");
	   synchronizedList.add("pythin");
	   synchronizedList.add("ruby");
	   
	   synchronized(synchronizedList) {
		   for(String lang: synchronizedList) {
			   System.out.println(lang);
		   }
	   }
	  }
	

}
