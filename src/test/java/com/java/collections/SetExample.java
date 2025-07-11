package com.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	/**
	 * Set Interface: Implementations --> HashSet (no order), LinkedHashSet (insertion order) and TreeSet (sorted)
	 * 
	 * 1. No duplicates
	 * 2. Insertion order depends on implementation
	 */
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new LinkedHashSet<>();
		Set<String> set3 = new TreeSet<>();
				
		Set<String> fruits = new HashSet<>();
		fruits.add("dragon fruit");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("guava");
		fruits.add("Banana");
		fruits.add("Apple"); // Duplicate ignored
		System.out.println(fruits); // [dragon fruit, Apple, Kiwi, guava, Banana] - order not guaranteed
		
		
		set2.add("dragon fruit");
		set2.add("Apple");
		set2.add("Kiwi");
		set2.add("guava");
		set2.add("Banana");
		set2.add("Apple"); // Duplicate ignored
		System.out.println(set2); // insertion order guaranteed
		
		set3.add("dragon fruit");
		set3.add("Apple");
		set3.add("Kiwi");
		set3.add("guava");
		set3.add("Banana");
		set3.add("Apple"); // Duplicate ignored
		System.out.println(set3); // sorting is guaranteed
		
		String[] names = {"naresh", "srikanth", "mahender", "greeshma", "kalyani"};
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Set<String> set = new TreeSet<>();
		for (String person : names) {
			set.add(person);
		}
		System.out.println(set);
	}
}
