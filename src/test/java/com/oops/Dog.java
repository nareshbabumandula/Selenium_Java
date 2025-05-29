package com.oops;

public class Dog extends Pet {
	
	// Characteristics of a dog
	int noOfLegs;
	String name;
	String color;
		
	// method or behavior or action
	// 1. access modifier 2. return type method name(arguments){ code implementation/logic}
	public void bark() {
		System.out.println(name + " is barking..!");
	}
	
	public void bite() {
		System.out.println(name + " can bite..!");
	}
	
	// parameterized constructor
	public Dog(String name, String color) {
		this.name=name;
		this.color=color;
	}
		
	public static void main(String[] args) {
		// Classname objReferenceName = new Constructor();
		Dog d = new Dog("Pillu", "White");
		d.bark();
		d.bite();
	}

}
