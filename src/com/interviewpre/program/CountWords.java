package com.interviewpre.program;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
	    String str = "Malayalam";
	     String[] split = str.split("");
//	    for (int i = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//		}
			HashMap<String,Integer> map = new HashMap<String,Integer>();
	     for (int i = 0; i < split.length; i++) {
	                   if(map.containsKey(split[i]))   {
	                	      Integer count = map.get(split[i]);
	                	      map.put(split[i], count+1);
	                   }   
	                   else
	                	   map.put(split[i], 1);
		}
	     System.out.println(map);
	}

}
