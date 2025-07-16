package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionsInstantiationTest {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Greeshma");
		alist.add("Kalyani");
		alist.add("Srikanth");
		alist.add("Greeshma");
		System.out.println(alist);
		
		Iterator alistIter = alist.iterator();
		
		while (alistIter.hasNext()) {
			System.out.println(alistIter.next());			
		}
				
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Ravi");
		llist.add("Shiva");
		llist.add("Naresh");
		System.out.println(llist);

		
		Iterator llistIter = llist.iterator();
		
		while (llistIter.hasNext()) {
			System.out.println(llistIter.next());			
		}
				
		Vector<String> vec = new Vector<String>();
		vec.add("Suman");
		vec.add("Raja");
		vec.add("Charitha");
		System.out.println(vec);
		System.out.println("First element is: " + vec.firstElement());
		System.out.println("Last element is: " + vec.lastElement());
		
		Iterator vecIter = vec.iterator();
		
		while (vecIter.hasNext()) {
			System.out.println(vecIter.next());			
		}
		
		Stack<String> stack = new Stack<String>();
		stack.add("Kiran");
		stack.add("Swetha");
		stack.add("Shahid");
		System.out.println(stack);
		System.out.println("First element is: " + stack.firstElement());
		System.out.println("Last element is: " + stack.lastElement());
				
		Iterator stackIter = stack.iterator();
		
		while (stackIter.hasNext()) {
			System.out.println(stackIter.next());			
		}
	}
}
