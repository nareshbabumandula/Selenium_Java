package com.java.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	
	// Queue Interface - FIFO
	
	public void priorityQueueExample() {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Arun");
		pq.add("Ramesh");
		pq.add("Riya");
		pq.add("Himabindhu");
		pq.add("Riya");
		pq.add("Ajay");
		
		pq.poll(); // It removes the head of the queue based on alphabetical order
		System.out.println(pq.peek()); // It retrieves the head of the queue based on alphabetical order

		//pq.removeAll(pq);
				
		Iterator<String> iter = pq.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	
		
	}

	public static void main(String[] args) {
		PriorityQueueTest pqt = new PriorityQueueTest();
		pqt.priorityQueueExample();

	}

}
