package com.interviewpre;


	public class DinnerExample {
	    public static void main(String[] args) {
	        Dinner dinner = new Dinner();

	        Thread child = new Thread(() -> {
	            try {
	                dinner.eatDinner();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread parent = new Thread(() -> {
	            try {
	                dinner.prepareDinner();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        child.start();
	        parent.start();
	    }
	}

	class Dinner {
	    private boolean isDinnerReady = false;

	    public synchronized void prepareDinner() throws InterruptedException {
	        System.out.println("Parent: I'm starting to cook dinner.");
	        Thread.sleep(3000);  // Simulates cooking time
	        isDinnerReady = true;
	        System.out.println("Parent: Dinner is ready!");
	        notify();  // Notifies the waiting child
	    }

	    public synchronized void eatDinner() throws InterruptedException {
	        System.out.println("Child: Is dinner ready?");
	        while (!isDinnerReady) {
	            System.out.println("Child: I guess not. I'll wait.");
	            wait();  // Child waits
	        }
	        System.out.println("Child: Yay! I'm eating dinner!");
	    }
	}

