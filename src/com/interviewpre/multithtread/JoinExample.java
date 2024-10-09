package com.interviewpre.multithtread;






public class JoinExample {

	private  String threadName;
	public JoinExample(String threadName) {
		
		this.threadName = threadName;
	}


	public static void main(String[] args) {
		
		JoinExample j=new JoinExample("Thread-1");
		JoinExample j2 = new JoinExample("Thread-2");
		JoinExample j3 = new JoinExample("Thread-3");
		
	   Thread t1 = new Thread(()->{
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println(j.threadName + "starting");
		   
	      
	   });
	          Thread t2=new Thread(()->{
	        	System.out.println(j2.threadName + "starting");
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        });
	        Thread t3=new Thread(()->{
	        	try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				 
				}
	        	System.out.println(j3.threadName + "starting");
	        });
	        t1.start();
	  
	      
	        try {
				t1.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        t2.start();
	     
	        try {
				t2.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	        t3.start();
	        try {
				t3.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("All thread completed");
	}

}
