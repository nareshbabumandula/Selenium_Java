package com.java.basics;

public class DataTypes {

	public static void main(String[] args) {
		// Primitive Datatypes : byte, short, int, long, float, double, boolean, char
		// In Java we have 8 primitive data types		
				byte b=123; // -128 to +127 --> 1 byte - 8 bits 
				short s=31900;
				int a=10;
				long l=73462;
				float f=13.6f;
				double d=536.464564;
				boolean bFlag=true;
				char c='t';
				System.out.println(b);
				System.out.println("Hello World..!");
				System.out.println("byte value is : " + b);
				System.out.println("short value is : " + s);
				System.out.println("integer value is " + a);
				System.out.println("long value is : " + l);
				System.out.println("float value is : " + f);
				System.out.println("double value is : " + d);
				System.out.println("boolean value is : " + bFlag);
				System.out.println("char value is : " + c);

				String str = "hello";
				System.out.println(str);
				String str1 ="Welcome to java";
				System.out.println(str1);

				// Widening --> storing smaller datatype into a bigger container
				byte b1=119;
				int a1=b1; // Implicit type casting or widening
				System.out.println(b1 + " " +a1);

				// Narrowing --> storing bigger datatype into a smaller container
				short s2=130;
				byte b2=(byte)s2; // Explicit type casting or narrowing
				System.out.println(s2 + " " +b2);
				
				// String is a pre-defined class in Java
				String sText="welcome to java software edition";
				String[] arrWords = sText.split(" ");
				System.out.println(arrWords[0]);
				System.out.println(arrWords[1]);
				System.out.println(arrWords[2]);
				System.out.println(arrWords[3]);
				System.out.println(arrWords[4]);
				System.out.println(arrWords[5]);
				

	}

}
