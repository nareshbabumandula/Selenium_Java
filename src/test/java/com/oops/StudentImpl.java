package com.oops;

public class StudentImpl {

	public static void main(String[] args) {
		Student student = new Student("Kalyani", 22, 75);
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Marks: " + student.getMarks());
		
		student.setAge(23);
		student.setName("Greeshma");
		student.setMarks(82);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Marks: " + student.getMarks());
		
	}

}
