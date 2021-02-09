package com.multithread.examples;

public class MultiThreadingRunnableExample implements Runnable{

	public static void main(String[] args) {
		
		MultiThreadingRunnableExample mre = new MultiThreadingRunnableExample();
		Thread tobj = new Thread(mre);
		tobj.start();
		
	}

	public void run() {
		
		System.out.println("My thread is in running state..!");
		
	}

}
