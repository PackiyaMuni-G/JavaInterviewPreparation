package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LastElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        Optional<String> first = list.stream().skip(list.size() - 1).findFirst();
        System.out.println(first.isPresent()?first.get():"none");

    }
}
