package com.interviewpre.multithtread;



class numberT extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class letterT  implements Runnable{

	@Override
	public void run() {
		for(char i='A';i<'E';i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class MultiThreadExample extends Thread {
	
	public static void main(String[] args) {
		Thread numberT=new numberT();
		Thread letterT=new Thread(new letterT());
		 numberT.start();
		 letterT.start();
	    }
	
		
	}


