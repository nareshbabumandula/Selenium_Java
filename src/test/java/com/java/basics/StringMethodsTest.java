package com.java.basics;

public class StringMethodsTest {

	public static void main(String[] args) {
		String str = "hello";
		String sText = "world";
		String asText = "WELCOME TO JAVA SE";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(0));
		System.out.println(str.contains("he"));
		System.out.println(str + " " + sText);
		System.out.println(str.toUpperCase() + " " +sText.toUpperCase());
		System.out.println(str.toUpperCase().concat(" ").concat(sText.toUpperCase()));
		System.out.println(asText.toLowerCase());
		System.out.println(str.indexOf('e'));
		System.out.println(str.equals("hello"));
		System.out.println(str.equalsIgnoreCase("HELLO"));
		System.out.println(asText.replace("SE", "SOFTWARE EDITION"));
		System.out.println(asText.endsWith("SE"));
		System.out.println(asText.startsWith("WELCOME"));
		System.out.println(asText.isBlank());
		System.out.println(asText.isEmpty());
		String s = "";
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(asText.substring(0, 10));
		
		String strText = "myContactForm.com is a free online email form creation and processing service that allows you to easily "
				+ "add contact forms to your web site. Our easy-to-use form wizard walks you through the form creation process and "
				+ "outputs a snippet of HTML code which embeds an email form into your web site. The difficult task of creating "
				+ "contact forms, email forms, feedback forms, questionnaires, "
				+ "surveys, order forms, polls, or any other type of web form is a thing of the past!";
		String[] arrText = strText.split(" ");
		System.out.println(arrText[0]);
		System.out.println(arrText[1]);
		System.out.println(arrText[2]);
		System.out.println(arrText[3]);
		System.out.println(arrText[4]);
		System.out.println("No of elements in the array are : " + arrText.length);
		for (String word : arrText) {
			System.out.println(word);
		}
		System.out.println(strText.join("|", arrText));
		
	}
}
