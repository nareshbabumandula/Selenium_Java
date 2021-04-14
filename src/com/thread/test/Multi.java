package com.thread.test;

class Multi extends Thread{  
	public void run(){  
		System.out.println("thread is running..."); 
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
	} 
	
	public static void main(String args[]){  
		Multi t1=new Multi();  
		/*
		 * Starting a thread: start() method of Thread class is used to start a newly
		 * created thread. It performs following tasks: 
		 * A new thread starts(with new callstack). 
		 * The thread moves from New state to the Runnable state. 
		 * When the thread gets a chance to execute, its target run() method will run.
		 */
		t1.start();  
	}  
}  
