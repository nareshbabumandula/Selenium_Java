package com.casting.example;

public class Test {

	public static void main(String[] args) {
		
		// Upcasting - It is a typecasting of child object to the parent object
		// Upcasting is done internally or implicitly
		Parent p = new Child();
		p.name = "Naresh";
		
		System.out.println(p.name);
		p.Demo();
		p.Test();
				
		// Downcasting - It is the typecasting of a parent object to the child object
		Child c = (Child)p;
		c.ID =123;
		System.out.println(c.ID);
		System.out.println(c.name);
		c.Demo();
		c.Test();
	

	}

}
