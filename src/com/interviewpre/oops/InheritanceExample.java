package com.interviewpre.oops;



class Animal{
    void sound(){
        System.out.println("animal make sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("bow bow");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
