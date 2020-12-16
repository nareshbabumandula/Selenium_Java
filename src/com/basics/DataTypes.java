package com.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		/*
		 * Java is statically-typed, so it expects its variables to be declared before
		 * they can be assigned values.
		 */
		// Primitive data types - byte, short, int, long, float, double, boolean & char
		byte a=127;
		short b=2341;
		char h ='t';
		int c = 124455;
		long d = 453465;
		float e = 23.55f;
		double f = 23245.45747;
		boolean g = true;
	
		System.out.println("Minimum value of a byte container is  : " + Byte.MIN_VALUE);
		System.out.println("Max value of a byte container is  : " + Byte.MAX_VALUE);
		
		System.out.println("Minimum value of a short container is  : " + Short.MIN_VALUE);
		System.out.println("Max value of a short container is  : " + Short.MAX_VALUE);

		// Non primitives data types
		String sText = "hello world this is core java";
		System.out.println(sText);
		
	}

}
