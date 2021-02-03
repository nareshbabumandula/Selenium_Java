package com.java.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class StackTest {
	
	// Stack uses dynamic array for storing the elements. It is synchronized
	// push, pop, peek etc
	
	public void StackExample() {
		
		//Stack stack = new Stack(); // Heterogeneous data 
		//List stack = new Stack();  // Upcasting
		//Vector stack = new Stack(); // Upcasting
		
		Stack<String> stack = new Stack<String>(); // Homogeneous data
		
		Stack<String> stack1 = new Stack<String>(); // Homogeneous data
		stack1.push("Kiran");
		stack1.push("Hari");
		stack.push("Naresh");
		stack.push("Bala");
		stack.push("Rajesh");
		stack.push("Ravi");
		stack.push("Rajesh");
		stack.push("Nishanth");
		stack.push("Riya");
		stack.pop(); // Removes the lastly inserted element
		stack.peek();  // Retrieves the top element
		System.out.println(stack.peek());
		stack.addAll(stack1);
			
			
		// Iterate and traverse through Iterator
		Iterator iter = stack.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			
	}
	
	

	public static void main(String[] args) {
		StackTest alt = new StackTest();
		alt.StackExample();
		
	}

}
