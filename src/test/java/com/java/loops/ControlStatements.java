package com.java.loops;

public class ControlStatements {

	void forLoopTest() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration is: " + i);
		}
	}
	
	void forLoopReverseTest() {
		System.out.println("For loop in reverse order..!");
		for (int i = 10; i >= 0; i--) {
			System.out.println("Iteration is: " + i);
		}
	}
	
	void forLoopEvenOddTest() {
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i + " is an odd number");
			}
		}
	}
	
	void primeNumberTest(int num) {
		int count=0;
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(num>2) {
			if(count>=1) {
				System.out.println(num + " is not a prime number");
			}else {
				System.out.println(num + " is a prime number");
			}
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
	
	
	public static void main(String[] args) {
		ControlStatements cs = new ControlStatements();
		cs.forLoopTest();
		cs.forLoopReverseTest();
		cs.forLoopEvenOddTest();
		cs.primeNumberTest(2);
		
	}

}
