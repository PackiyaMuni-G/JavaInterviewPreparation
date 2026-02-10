package com.interviewpre.streamapi;

public class RemoveALL {
    public static void main(String[] args) {
        String str="Hello World";
        String s = str.replaceAll("[aeiouAeiou]", "");
        System.out.println(s);


    }
}
