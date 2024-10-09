package com.interviewpre.java8;

import java.util.Random;

class MultiTask{
	public void playSongs(String str) throws InterruptedException{
		System.out.println(str + " song is playing ");
		
		Thread.sleep(500);
		
		System.out.println(str + " song ends");
	}
	
	public void todoTasks(String task) throws InterruptedException {
	System.out.println(task + " is doing rightnow ");
	
	Thread.sleep(500);
		
		System.out.println(task + " tasks ends");
	}
}




public class Multithread2 {

	static String[] songs= {"yuvan","arr","ilayarja","harris","gv","hiphop","anirudh"};
	static String[] tasks= {"building restapi","make responsive design","create sql query","writing junit testcases","design page through css","build userinteractive","manaage state for app"};
	public static void main(String[] args) throws InterruptedException {
		MultiTask multi=new MultiTask();
		Random random=new Random();
	
		Runnable songThread=()->{
			try {
				multi.playSongs(songs[random.nextInt(songs.length)]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable taskThread=()->{
			try {
				multi.todoTasks(tasks[random.nextInt(tasks.length)]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread t1=new Thread(songThread);
		Thread t2=new Thread(taskThread);
		
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
	}

}
