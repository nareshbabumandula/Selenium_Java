package com.java.basics;

public class StringMethodsTest {

	public static void main(String[] args) {
		String str = "hello";
		String sText = "world";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(0));
		System.out.println(str.contains("he"));
		System.out.println(str + " " + sText);
		System.out.println(str.toUpperCase() + " " +sText.toUpperCase());
		System.out.println(str.toUpperCase().concat(" ").concat(sText.toUpperCase()));
		
	}

}
