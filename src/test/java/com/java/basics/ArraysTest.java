package com.java.basics;

public class ArraysTest {

	public static void main(String[] args) {
		/**
		 * 1. Arrays are fixed in nature
		 * 2. Arrays accept homogeneous data type
		 * 3. No built-in methods other length method
		 * 4. Performance wise fast for fixed data
		 * 5. Allows primitive data types for storage
		 * 6. Arrays allows type safety
		 * 7. Use case: When size is known and fixed
		 */
		// 1. Using the new keyword with size
		int[] numbers = new int[5];
		numbers[4]=100;
		System.out.println("Length of numbers array is: " + numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		// System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
		
		// 2. Using Array Initializer (Static Initialization)
		int[] nums = {1,2,3,4,5};
		System.out.println(nums[1]);
			
		String[] names = {"Greeshma", "Kalyani", "Sagar", "Srikanth"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		for (String student : names) {
			System.out.println("Student name is: " + student);
		}
		
		// Using new keyword with Array Initializer
		int[] n = new int[] {10,20,30};
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		
		// Multidimensional array
		int[][] matrix = new int[2][3]; // 2 rows, 3 columns
		//matrix[0][0] matrix[0][1] matrix[0][2]
		//matrix[1][0] matrix[1][1] matrix[1][2]
		matrix[0][0]=10;
		matrix[0][1]=20;
		matrix[0][2]=30;
		
		matrix[1][0]=40;
		matrix[1][1]=50;
		matrix[1][2]=60;
		
		for(int i=0; i<2;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
