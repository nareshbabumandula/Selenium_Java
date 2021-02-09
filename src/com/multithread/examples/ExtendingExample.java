package com.multithread.examples;

class ExtendingExample{

	public static void main(String[] args) {
		CountExample ce = new CountExample();

		try {
			while (ce.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread is interuppted");
		}
		System.out.println("Main thread run is over..!");

	}


}
