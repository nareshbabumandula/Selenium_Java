package com.basics;

public class BVA {


	public void userRegistration(String Username, String Password){

		// Check point will be kept at boundaries
		if(!(Password.length()>=4 && Password.length()<=12)) {
			System.out.println("Use 4 character or longer and 12 character or less");
		}


	}

	public static void main(String[] args) {
		
		BVA bv = new BVA();
		bv.userRegistration("naresh", "abc");

	}

}
