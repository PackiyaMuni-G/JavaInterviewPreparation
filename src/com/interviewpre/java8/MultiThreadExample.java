package com.interviewpre.java8;

import java.util.Random;

class RandomPlayer{
	public void playGame(String gameName) throws InterruptedException {
		System.out.println("game started: "+gameName);
	Thread.sleep(1000);
	System.out.println("game ended: "+gameName);
	}
	public void playTrack(String trackName) throws InterruptedException {
	System.out.println("trackname statred: "+trackName);	
	Thread.sleep(1000);
	System.out.println("trackname ended: "+trackName);	
	
	}
}

public class MultiThreadExample {
	
	 static String[] games
     = { "COD",      "Prince Of Persia", "GTA-V5",
         "Valorant", "FIFA 22",          "Fortnite" };
 static String[] tracks
     = { "Believer", "Cradles", "Taki Taki", "Sorry",
         "Let Me Love You" };

	public static void main(String[] args) {
		
	RandomPlayer rp = new RandomPlayer();
		Random random=new Random();		
		Runnable run=()->{
			try {
				rp.playGame(games[random.nextInt(games.length)]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
	Runnable run1=()->{
			 try {
				rp.playTrack(tracks[random.nextInt(tracks.length)]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread game = new Thread(run);
		Thread track = new Thread(run1);
		
		game.start();
		track.start();
	}

}
