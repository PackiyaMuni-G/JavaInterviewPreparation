package com.interviewpre.dp;

public class FactoryMain {

	public static void main(String[] args) {
		 OS obj1=new Android();
		 obj1.specs();
         OperatingSystemFactory obj = new OperatingSystemFactory();
         OS instance = obj.getInstance("closed");
         instance.specs();

	}

}
