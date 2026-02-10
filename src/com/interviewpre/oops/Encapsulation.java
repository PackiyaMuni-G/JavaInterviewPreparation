package com.interviewpre.oops;

public class Encapsulation {
  private   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
}
class ExecutionClass{
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setAge(30);
        e.setName("muni");
        System.out.println( "his name is : "+ e.getName() + " \nand " +" his age is : " + e.getAge());
    }
}
