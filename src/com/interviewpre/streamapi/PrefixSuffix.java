package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffix {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = list.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(list);
    }
}
