package com.oops.examples;

public class MethodOverridingTest extends MethodOverloadingTest {

	public void accessSite() { 
		System.out.println("Executing accessSite method from MethodOverridingTest class"); 
	}
	
	
	public void Demo() {
		super.accessSite();
		this.accessSite();
		accessSite();
	}

	public static void main(String[] args) {

		MethodOverridingTest override = new MethodOverridingTest();
		override.Demo();
		override.accessSite("google.com");
	
	}


}
