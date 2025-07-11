package com.exceptions;

/**
 * Unchecked Exceptions: These are not checked at compile time. They are usually caused by logical programming
 * errors and extend from RuntimeException.

🔹 Common Examples:
    NullPointerException
    ArrayIndexOutOfBoundsException
    ArithmeticException
    IllegalArgumentException
 *
 */
public class UncheckedExceptionsTest {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int res = a/b; // This will throw ArithmeticException at runtime
		System.out.println("Result: " + res);
	}

}
