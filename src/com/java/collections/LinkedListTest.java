package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public void LinkedListExample() {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Rajesh");
		list.add("Naresh");
		list.add("Riya");
		list.add("Bala");
		list.add("Ramesh");
		list.add("Nishanth");
		list.add("Himabindhu");
	
		System.out.println(list.get(0));
		System.out.println(list.contains("Naresh"));
		System.out.println(list.isEmpty());
		list.add(0,"Kiran");
		System.out.println("Frist Element is : " + list.getFirst());
		list.add("John");
		System.out.println("Last element is : "+ list.getLast());
		//list.remove(0);
		list.poll();
		//System.out.println(list.poll());
		System.out.println("First element using peek method : " + list.peek());
			
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
	
	public static void main(String[] args) {
		LinkedListTest lt = new LinkedListTest();
		lt.LinkedListExample();

	}

}
