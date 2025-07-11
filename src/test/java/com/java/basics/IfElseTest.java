package com.java.basics;

import java.util.Scanner;

public class IfElseTest {
	
	public void compareNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		if (a>b) {
			// if block
			System.out.println("a is greater than b");
		} else if(a==b) {
			// else-if block
			System.out.println("a is equal to b");
		} else {
			// else block
			System.out.println("a is less than b");
		}
	}
	
	public void eveorOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = sc.nextInt();
		
		if (a%2==0) {
			System.out.println(a + " is an even number");
		} else {
			System.out.println(a + " is an odd number");
		}
	}

	public static void main(String[] args) {
	   IfElseTest it = new IfElseTest();
	   it.compareNumbers();
	   it.eveorOdd();
	}

}
