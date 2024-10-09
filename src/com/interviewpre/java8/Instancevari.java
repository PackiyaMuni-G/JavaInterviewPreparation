package com.interviewpre.java8;



@FunctionalInterface
interface modify{
	void add();
}
public class Instancevari {
	int data=170;

	public static void main(String[] args) {
		Instancevari obj=new Instancevari();
		modify m=()->{
			System.out.println("intial data" + obj.data);
			 obj.data+=500;
			 System.out.println("modify :" + obj.data);
		};
             m.add();
             obj.data+=200;
             System.out.println("final data:"+obj.data);
	}

}
