package com.interviewpre.java8;

public class ThreadLamp {

	public static void main(String[] args) {
		Runnable run=()->{
			System.out.println("thread running");
			System.out.println(	Thread.currentThread().getName());
		;
		};
		
		Thread thread=new Thread(run);
		Thread thread1=new Thread(run);
		
		thread.start();
		thread1.start();

	}

}
