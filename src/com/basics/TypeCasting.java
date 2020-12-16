package com.basics;

public class TypeCasting {

	public static void main(String[] args) {

		// Widening Casting - Converting a smaller type to a larger type
		// e.g. byte -> short -> char -> int -> long -> float -> double
		byte c = 125;
		short s = c;
		System.out.println(s);

		// Narrowing Casting - Converting a bigger type to a smaller type
		// e.g. double -> float -> long -> int -> char -> short -> byte
		int a=-130;
		byte b =(byte) a;    // Byte -128 to 127
		System.out.println(b);

	}

}
