package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	
	public void hashmapExample() {
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "Selenium");
		map.put(2, "UFT");
		map.put(3, "TestComplete");
		map.put(4, "Ranorex");
		map.put(5, "Selenium");
		map.put(2, "Sikuli");
		
		map.remove(3);
		
		System.out.println(map);
		
		for (Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
			
	}
	
	

	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.hashmapExample();

		
	}

}
