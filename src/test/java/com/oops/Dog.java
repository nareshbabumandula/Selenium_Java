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
	
	// concrete java method
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
		/*
		 * Step 1: Class Loading
		 * 
		 * When the Dog class is used for the first time (e.g at object
		 * creation), the class is loaded into memory by the ClassLoader. It loads
		 * Dog.class bytecode into the JVM
		 * 
		 * Step 2: Object Creation in Heap
		 * 
		 * new Dog() creates an object of type Dog in the heap memory. The heap is where Java
		 * stores dynamically allocated objects
		 * 
		 * Step 3: Memory Allocation & Initialization
		 * 
		 * The JVM allocates memory for the object and initializes its member variables with default values
		 * because no constructor arguments or explicit assignments are provided
		 * 
		 * e.g.
		 * 
		 * 	int noOfLegs -> default value is 0;
		 * 	String name -> default value is null;
		 * 	String color -> default value is null
		 * 
		 *  So internally it assigns values like below
		 *  dog.noOfLegs = 0
		 *  dog.name = null;
		 *  
		 *  Step 4: Reference Assignment
		 *  
		 *  d is a reference variable that is stored in the stack memory. It holds the memory address
		 *  of the newly created object in the heap.
		 *  
		 *  Step 5: Constructor Execution
		 *    
		 *  
		 */
		d.bark(); // calling the current class method
		d.bite(); // calling the current class method
		d.walk("Pillu"); // inheriting and calling the method from Pet class
		d.run("Pillu");
		d.reproduction("Pillu");

	}

}
