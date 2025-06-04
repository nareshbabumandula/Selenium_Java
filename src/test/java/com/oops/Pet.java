package com.oops;

public class Pet extends Animal{
	
	String breed;
	
	public void walk(String name) {
		System.out.println(name + " is walking..!");
	}
	
	public void run(String name) {
		System.out.println(name + " is running..!");
	}
}
