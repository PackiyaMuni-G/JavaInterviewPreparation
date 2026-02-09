package com.interviewpre.streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



			public class CharFrequency {
			
				public static void main(String[] args) {
					String input = "java";
					Map<Character, Long> freq = input.chars()
							.mapToObj(c -> (char) c) // Convert Unicode to character
							.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
					
					freq.forEach((character, count) -> System.out.println(character + "=" + count));
				}
			}

	


