package com.control.statements;

import java.util.Scanner;

public class IfTest {

	public void IfExample() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();

		if (a<10) {
			// if block
			System.out.println("a is less than 10");
		}
	}


	public void IfElseExample() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();

		if (a>b) {
			System.out.println("a is greater than b");
		}else {
			// else block
			System.out.println("a is less than b");
		}
	}

	public void IfElseIfExample() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();

		if (a>b) {
			System.out.println("a is greater than b");
		}else if(a==b) {
			System.out.println("a is equal to b");
		}else {
			// else block
			System.out.println("a is less than b");
		}
	}

	public void enhancedIf() {
		int a=1000;
	
		if (a<100) System.out.println("a is less than 100");
		else System.out.println("a is greater than 100"); 
		
	}

	public static void main(String[] args) {
		IfTest it = new IfTest();
		//it.IfExample();
		//it.IfElseExample();
		//it.IfElseIfExample();
		it.enhancedIf();
	}

}
