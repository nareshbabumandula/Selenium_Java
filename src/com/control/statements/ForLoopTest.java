package com.control.statements;

public class ForLoopTest {

	public void forExample() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Iteration : " + i); 
			if (i==4) break; 
		}

	}
	
	public void forLooponArray() {
		int[] num={1,4,2,7,6,10};
		for (int i = 0; i < num.length; i++) {
			System.out.println("Array element is : " + num[i]);
		}
	}

	public static void main(String[] args) {
		ForLoopTest flt = new ForLoopTest();
		flt.forExample();
		flt.forLooponArray();
	}

}
