package com.interviewpre.collections;


import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	
	TreeMap<String, Integer> treeMap = new TreeMap<>();
	treeMap.put("Banana", 20);
	treeMap.put("Apple", 10);
	treeMap.put("Orange", 30);
//	treeMap.put(null, 30);
	System.out.println(treeMap); // Output: {Apple=10, Banana=20, Orange=30} (keys are sorted)

}
}
