package com.java.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	
	public void hashsetExample() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Rajesh");
		set.add("Riya");
		set.add("Himabindhu");
		set.add("Ramesh");
		set.add("Bala");
		set.add("Riya");
		set.add(null);
		
		// Traverse through all the elements of hashset collection
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

	public static void main(String[] args) {
		LinkedHashSetTest hset = new LinkedHashSetTest();
		hset.hashsetExample();

	}

}
