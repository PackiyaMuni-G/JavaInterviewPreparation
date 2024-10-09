package com.interviewpre.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
    
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add some key-value pairs
        map.put("A", 1);
        map.put("B", 2);

        // Start multiple threads that modify the map
//        Runnable task=()-> {
//        	 for (int i = 0; i < 1000; i++) {
//        	        map.put("key" + i, i);
//        	    }
//			
//			
//		};
        
        Runnable task=()-> {
				for (int i = 0; i < 1000; i++) {
				            map.put("key" + i, i);
				        }
				
			
		};

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the size of the map after both threads have finished
        System.out.println("Map size: " + map.size());
    }
}
