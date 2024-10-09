package com.interviewpre.java8;


import java.util.stream.Stream;

public class StreamFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<String> mystream=Stream.of("Like", "and", "Share", 
        "https://www.geeksforgeeks.org/");


mystream.filter(n -> n.startsWith("https"))
.forEach(n -> System.out.println(n));
// .forEach(System.out::println);
	}

}
