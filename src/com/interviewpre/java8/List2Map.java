package com.interviewpre.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ListItems{
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	private int key;

	private String value;
	public ListItems(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}


	
}


public class List2Map {
public static void main(String[] args) {
	List<ListItems> list=new ArrayList<>();
	list.add(new ListItems(1, "muni"));
	list.add(new ListItems(2, "guru"));
	list.add(new ListItems(3, "theivanai"));
	list.add(new ListItems(4
			, "muniselvam"));
	
	HashMap<Integer, String> hm=new HashMap<>();
	list.forEach((n)->{
		hm.put(n.getKey(), n.getValue());
	});
	System.out.println(hm);
}
}
