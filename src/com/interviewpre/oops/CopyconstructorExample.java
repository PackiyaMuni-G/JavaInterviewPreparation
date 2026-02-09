package com.interviewpre.oops;


import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

class  Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}


public class CopyconstructorExample {
    public static void main(String[] args) {


        Student s1=new Student("Muni");
        System.out.println(s1.name);

    }
}
