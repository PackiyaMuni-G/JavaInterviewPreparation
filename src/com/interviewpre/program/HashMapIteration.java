package com.interviewpre.program;
import java.util.*;
import java.util.Map.Entry;
public class HashMapIteration {

	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap();
	 map.put(2, "Saket");
     map.put(25, "Saurav");
     map.put(12, "HashMap");
         Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
//                  while(iterator.hasNext()) {
//                	 Entry<Integer, String> next = iterator.next();
//                	 System.out.println(next.getKey() + " " + next.getValue());
//                  }
//         for(Entry me: map.entrySet()) {
//        	 System.out.println(me.getKey() + " " + me.getValue());
//         }
//	}
         for(Integer key: map.keySet()) {
        	 System.out.println(key + " " + "value " + map.get(key));
         }
     
	}
} 
