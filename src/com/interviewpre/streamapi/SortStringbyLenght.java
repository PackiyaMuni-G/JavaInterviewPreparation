package com.interviewpre.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringbyLenght {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> collect = list
                .stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
