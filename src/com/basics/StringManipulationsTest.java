package com.basics;

public class StringManipulationsTest {
	
	public static int login(String strText) {
		return strText.length();
	}

	public static void main(String[] args) {
		
		String sText1 = "hello world";
		String sText2 = "WELCOME TO JAVA TRAINING";
		String sText3 = "       HELLO        ";
		
		System.out.println("Length of the string sText1 is : " + sText1.length());
		System.out.println(sText1.toUpperCase()); // Convert string to uppercase
		System.out.println(sText2.toLowerCase()); // Convert string to lowercase
		System.out.println(sText3);
		System.out.println(sText3.trim()); // Remove spaces from either sides
		System.out.println(sText1.charAt(0));
		System.out.println(sText2.indexOf('W'));
		System.out.println(sText2.contains("JAVA")); // Returns boolean value
		System.out.println(sText2.contains("   training   ".toUpperCase().trim()));
		System.out.println(sText1.concat(" ").concat("welcome to core java training..!"));
		System.out.println(sText1 + " " + "welcome to core java training..!");
		System.out.println(sText2.equals("WELCOME TO JAVA TRAINING"));
		System.out.println(sText2.replace("JAVA", "CORE JAVA ONLINE"));
		System.out.println(sText1.equalsIgnoreCase("HELLO WORLD"));
		System.out.println(login("Demo Test"));
	}

}
