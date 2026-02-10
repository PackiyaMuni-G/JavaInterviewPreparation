package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Javaspringboot", "Python", "JavaScript", "C++", "Ruby");
       Optional<String> highestString = list.stream()
               .max(Comparator.comparingInt(String::length)).stream().findFirst();


System.out.println(highestString.isPresent()?highestString.get():"no");
    }
}
