package com.thread.test;

class MultiTest implements Runnable{  
	
	@Override
	public void run() {
		System.out.println("Thread is running..!");
	}  
	
	public static void main(String args[]){  
		MultiTest m1=new MultiTest();  
		Thread t1 =new Thread(m1);  
		t1.start();  
	}

	
} 