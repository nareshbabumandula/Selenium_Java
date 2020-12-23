package com.oops.examples;

public class MethodOverloadingTest {
	
	public void accessSite() {
		System.out.println("Executing accessSite method from MethodOverloadingTest class");
	}
	
	public void accessSite(String URL) {
		System.out.println("Successfully accessed the site..! " + URL);
	}
	
	public void accessSite(String Browser, String URL) {
		System.out.println("Successfully accessed the site..! " + URL + " in browser " + Browser);
		System.out.println(URL +  " " + Browser);
	}
	
	//Constructor 
	MethodOverloadingTest(){
		System.out.println("This is a no argument constructor..!");
	}
	
	//Constructor 
	MethodOverloadingTest(String URL){
		System.out.println("This is a parameterized constructor..!");
	}
	
	public static void main(String[] args) {

		MethodOverloadingTest mol = new MethodOverloadingTest();
		mol.accessSite("Chrome", "http://www.blazedemo.com");

	}

}
