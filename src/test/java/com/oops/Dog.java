package com.oops;

public class Dog extends Pet {
	
	// Object: Any entity which has got state and behavior is called as an object 
	// Inheritance: Inheriting/Calling parent class properties and behavior into child class
	/*
	 * Types of Inheritance: Single Inheritance: One subclass inherits from one superclass. 
	 * Multilevel Inheritance: A subclass inherits from another subclass, creating a chain of inheritance. 
	 * Hierarchical Inheritance: Multiple subclasses inherit from one superclass. 
	 * Multiple Inheritance: Not directly supported in Java (a class cannot extend multiple classes), but can be
	 * achieved using interfaces. 
	 * Hybrid Inheritance: A combination of two or more types of inheritance.
	 */
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
		d.bark(); // calling the current class method
		d.bite(); // calling the current class method
		d.walk("Pillu"); // inheriting and calling the method from Pet class
		d.run("Pillu");
		d.reproduction("Pillu");
	}

}
