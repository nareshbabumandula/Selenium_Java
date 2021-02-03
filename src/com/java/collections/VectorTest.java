package com.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	// Vector uses dynamic array for storing the elements. It is synchronized
	public void vectorExample() {
		
		Vector<String> vec = new Vector<String>();
				
		vec.add("Naresh");
		vec.add("Rajesh");
		vec.add("Nishanth");
		vec.add("Riya");
		vec.add("Himabindu");
		vec.add("Bala");
		vec.add("Ramesh");
		vec.add("Manohar");
		vec.add("Shilpa");
		vec.add("Naresh");
		vec.add(null);
		vec.add("");
		System.out.println("Capacity of the vector is  : " + vec.capacity());
		System.out.println(vec.firstElement());
					
		System.out.println("No of elements are : " + vec.size());	
		System.out.println(vec.get(0));
		vec.remove(1);
		vec.add("Rajesh Sharma");
		vec.add(0, "Ruken");
		
		Vector<String> vec1 = new Vector<String>();
		vec1.add("Kiran");
		vec1.add("Anjali");
		
		System.out.println(vec.isEmpty());
		//System.out.println(vec.removeAll(vec));
		System.out.println(vec.lastIndexOf(vec));
		System.out.println(vec.addAll(vec1));
			
		// Iterate and traverse through Iterator
		Iterator iter = vec.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			
	}
		

	public static void main(String[] args) {
		VectorTest alt = new VectorTest();
		alt.vectorExample();
		
	}

}
