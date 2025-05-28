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

	public static void main(String[] args) {
		// Classname objReferenceName = new Constructor();
		Dog d = new Dog();
		d.name="Pillu";
		d.bark();
		d.bite();
		d.walk(d.name);
		d.run(d.name);
	}

}
