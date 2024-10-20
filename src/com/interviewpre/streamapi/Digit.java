package com.interviewpre.streamapi;

import java.util.Arrays;

import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Collectors;

public class Digit {

	public static void main(String[] args) {
List<String> Strings = Arrays.asList("123", "abc", "456", "789", "def");
 Predicate<? super String> match = s->s.matches("\\d+");
 List<String> digit = Strings.stream().filter(match).collect(Collectors.toList());
 System.out.println(digit);
	}

}
