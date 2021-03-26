package com.casting.example;

import java.io.*; 

class SumOfNumbers { 

	/* Function to get sum of digits */
	static int getSum(int n) 
	{     
		int sum = 0; 

		while (n != 0) 
		{ 
			sum = sum + n % 10; 
			n = n/10; 
		} 

		return sum; 
	} 

	// Driver program 
	public static void main(String[] args) 
	{ 
		int n = 687; 

		System.out.println(getSum(n)); 
	} 
} 