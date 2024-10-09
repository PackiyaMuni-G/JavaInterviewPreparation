package com.interviewpre.java8;

import java.util.Random;

class DownloadManager{
	public static void main(String[] args) throws InterruptedException {
		   String[] fileArr = {"file1.png", "file2.pdf", "file3.doc", "file4.txt", "file5.xl"};
		   Thread[] downloadThread=new Thread[fileArr.length];
		   Random random = new Random();
		   
		   for(int i=0;i<fileArr.length;i++) {
			               String file=fileArr[i];
			   downloadThread[i] = new Thread(()->{
				      
				   int downloadTime= random.nextInt(5000)+1000;
				   
				   System.out.println(file + " started downloading");
				   
				   try {
					Thread.sleep(downloadTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   System.out.println(file + " finished download");
			   });
			   
			   downloadThread[i].start();
			   
		   }
		   
		   for(int i=0;i<fileArr.length;i++) {
			   downloadThread[i].join();
		   }
		   System.out.println("All are download completed");
		   
		   
		   
		   processEachFileDownloaded(fileArr);
		   
		   
		   
	}
	
	public static void processEachFileDownloaded(String[] file) {
		
		System.out.println("here all download files are going to process");
		
		
		for(String f: file) {
			System.out.println(f + "processing");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All are processed");
		
	}
}