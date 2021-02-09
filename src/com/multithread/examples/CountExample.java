package com.multithread.examples;

public class CountExample extends Thread{
	
	CountExample(){
		super("My extended thread..!");
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Iteration is : " + i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("My thread is interuppted");
		}
		System.out.println("My thread run is over..!");
	}
	

}


