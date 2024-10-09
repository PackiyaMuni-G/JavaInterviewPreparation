package com.interviewpre.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator<String> iterator = list.iterator();
       

        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Two")) {
                // This will cause ConcurrentModificationException
                list.remove(value);
            }
        }
    }
}
