package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	/**
	 * 1. ArrayList is class implementing List interface
	 * 2. ArrayList accepts duplicate values
	 * 3. Insertion order is maintained in ArrayList
	 * 4. ArrayList accepts more than one null values
	 * 5. ArrayList is resizable
	 * 6. ArrayList is index based
	 */
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
				
		alist.add("Ravi");
		alist.add("Srikanth");
		alist.add("Sagar");
		alist.add("Greeshma");
		alist.add("Kalyani");
		alist.add("Ravi");
		alist.add(null);
		alist.add(null);
		System.out.println(alist.get(0));		
		System.out.println(alist.get(1));	
		alist.remove(1);
		System.out.println(alist.contains("Ravi"));
		System.out.println(alist.lastIndexOf("Sagar"));
		System.out.println(alist.isEmpty());	
		System.out.println(alist.lastIndexOf("Ravi"));
		System.out.println(alist);
	}
}
