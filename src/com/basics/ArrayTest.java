package com.basics;

public class ArrayTest {
	
	public void arrayExample() {
		
		int marks[] = {10,30,60,80,100}; // Array Initialization and assignment
		System.out.println("Length of the marks array is : " + marks.length);
		System.out.println(marks[0]);
		System.out.println(marks[4]);
		
		String names[] = new String[4]; // Array Initialization and length declaration
		names[0]="Naresh";
		names[1]="Nishanth";
		names[2]="Riya";
		names[3]="Himabindhu";
				
		System.out.println(names[0]);  // Array index will follow n-1 
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println("Length of the names array is : " + names.length);
		
		
	}
	
	

	public static void main(String[] args) {
		ArrayTest alt = new ArrayTest();
		alt.arrayExample();

	}

}
