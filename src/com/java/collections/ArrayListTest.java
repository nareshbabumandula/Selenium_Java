package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	public void arrayListExample() {
		
		ArrayList<String> list = new ArrayList<String>();
				
		list.add("Naresh");
		list.add("Rajesh");
		list.add("Nishanth");
		list.add("Riya");
		list.add("Himabindu");
		list.add("Bala");
		list.add("Ramesh");
		list.add("Manohar");
		
		System.out.println(list.get(0));
		list.remove(1);
		list.add("Rajesh Sharma");
		list.add(0, "Ruken");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Kiran");
		list1.add("Anjali");
		
		System.out.println(list.isEmpty());
		//System.out.println(list.removeAll(list));
		System.out.println(list.lastIndexOf(list));
		System.out.println(list.addAll(list1));
			
		// Iterate and traverse through Iterator
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			
	}
	
	

	public static void main(String[] args) {
		ArrayListTest alt = new ArrayListTest();
		alt.arrayListExample();
		
	}

}