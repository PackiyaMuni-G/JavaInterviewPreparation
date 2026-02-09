package com.interviewpre.streamapi;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MaxInteger {
    public static void main(String[] args) {
       OptionalDouble max= Arrays.asList(1,9,5,8,3,4)
        .stream()
        .mapToDouble(Integer::doubleValue)
        .max();
        System.out.println(max.isPresent()?max.getAsDouble():"N/A");
        
    };
    
}
