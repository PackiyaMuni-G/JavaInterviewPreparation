package com.interviewpre.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentExample {
public static void main(String[] args) {
	ConcurrentHashMap<String, Integer> wordCount = new ConcurrentHashMap<>();
    // Adding elements to the map
    wordCount.put("Apple", 1);
    wordCount.put("Banana", 2);
    wordCount.put("Orange", 3);

    // Retrieving an element
    System.out.println("Count of Bananas: " + wordCount.get("Banana"));

    // Removing an element
    wordCount.remove("Apple");

    // Checking if the map contains a key
    System.out.println("Does map contain 'Orange'? " + wordCount.containsKey("Orange"));
}
}
