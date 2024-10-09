package com.interviewpre.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	pq.add(10);
	pq.add(3);
	pq.add(100);
	pq.add(1);
	pq.add(16);
	pq.add(32);
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.isEmpty());
	
	
}
}
