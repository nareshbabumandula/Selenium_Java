package com.exceptions;

public class TryCatchExamples {

	public static void main(String[] args) {
		// try with catch block
		try {
			int a=10;
			int b=10;
			int c=a/b;
			System.out.println("Result of a/b is: " + c);
			String[] names = {"greeshma", "kalyani", "ravi", "sai", "teja"};
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
			System.out.println(names[5]); // ArrayIndexOutOfBoundsException
		} catch (Exception e) {
			System.out.println("Executing catch block");
			e.printStackTrace();
		}


		// try with multiple catch blocks
		try {
			String s = null;
			System.out.println(s.length());
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("Result of a/b is: " + c);
			String[] names = {"greeshma", "kalyani", "ravi", "sai", "teja"};
			System.out.println(names[0]);
			System.out.println(names[5]);
		} catch (ArithmeticException e) {
			System.out.println("Executing ArithmeticException catch block..!");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Executing ArrayIndexOutOfBoundsException catch block..!");
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println("Executing NullPointerException catch block..!");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Executing Exception catch block..!");
			e.printStackTrace();
		}

		// try with finally block
		try {
			int a=10;
			int b=10;
			int c=a/b;
			System.out.println("Result of a/b is: " + c);
			String[] names = {"greeshma", "kalyani", "ravi", "sai", "teja"};
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
			System.out.println(names[5]); // ArrayIndexOutOfBoundsException
		} finally {
			System.out.println("Executing finally block");
		}
		
		try {
			
		} catch (Exception e) {
			
		} finally {
			
		}
	}

}
