package com.oops;

public class Student {
	
	private String name;
	private int age;
	private double marks;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >0) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		if (marks>=0 && marks <=100) {
			this.marks = marks;
		} else {
			System.out.println("Marks should be between 0 and 100");
		}
	}

	public Student(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	
}
