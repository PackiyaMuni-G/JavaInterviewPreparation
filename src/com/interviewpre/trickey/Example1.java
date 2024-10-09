package com.interviewpre.trickey;

class Test {
    void method(int... nums) {
        System.out.println("int varargs");
    }

    void method(String s, Integer... nums) {
        System.out.println("Integer varargs");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.method(1, 2, 3);                // Calls int varargs
        t.method("Hello", 1, 2, 3);       // Calls Integer varargs with additional String argument
    }
}
