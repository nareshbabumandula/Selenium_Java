package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterOccurance {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String str = "preethi";
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry entry: map.entrySet()){
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}

}
