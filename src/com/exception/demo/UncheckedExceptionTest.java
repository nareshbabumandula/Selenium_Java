package com.exception.demo;

public class UncheckedExceptionTest {

	//Method
	public void division(int a, int b){
		
		boolean bFlag = false;
		
		try {
			int marks[] = {12,45,45,70,60,90};
			System.out.println(marks[0]);
			System.out.println(marks[1]);
			System.out.println(marks[10]); // ArrayIndexOutofBounds Exception
			
			int c = a/b;
			System.out.println("Division of a and b is : " + c);
			c =b/a;
			System.out.println("Division of b and a is  : " + c);
			bFlag = true; // last line of try block
		}catch (ArithmeticException e) {
			System.out.println("Executing catch block of ArithmeticException..!");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Executing catch block of ArrayIndexOutOfBoundsException..!");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Executing catch block of Exception..!");
			System.out.println(e.getMessage());
		}
		
		
		finally {
			if (bFlag) {
				System.out.println("Successfully performed division operation on a and b variable");
			} else {
				System.out.println("Failed to perform division operation on a and b variable");
			}
		}
		
	}


	public static void main(String args[]){

		UncheckedExceptionTest arth = new UncheckedExceptionTest();
		arth.division(100, 0);
	}

}
