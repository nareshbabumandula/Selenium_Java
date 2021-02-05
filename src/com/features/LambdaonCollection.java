package com.features;

import java.util.ArrayList;
import java.util.List;

public class LambdaonCollection {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Bala");
		list.add("Naresh");
		list.add("Nishanth");
		list.add("Himabindhu");
		list.add("Riya");
		list.add("Ramesh");
		list.add("Manohar");
		list.add("Rajesh");
		
		list.forEach((e)->System.out.println(e));
		
		
	}

}
