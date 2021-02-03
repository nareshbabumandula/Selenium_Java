package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public void hashsetExample() {
		
		HashSet<String> set = new HashSet<String>();
		
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
		HashSetTest hset = new HashSetTest();
		hset.hashsetExample();

	}

}
