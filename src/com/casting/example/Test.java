package com.casting.example;

public class Test {

	public static void main(String[] args) {
		
		// Upcasting
		Parent p = new Child();
		p.name = "Naresh";
		
		System.out.println(p.name);
		p.Demo();
		
		// Downcasting
		Child c = (Child)p;
		c.ID =123;
		System.out.println(c.ID);
		System.out.println(c.name);
		c.Demo();
	

	}

}
