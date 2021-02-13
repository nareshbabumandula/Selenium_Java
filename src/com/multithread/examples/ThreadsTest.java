package com.multithread.examples;


public class ThreadsTest implements Runnable{

	
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
