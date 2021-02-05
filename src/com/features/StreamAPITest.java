package com.features;

import java.util.stream.IntStream;

public class StreamAPITest {

	public static void main(String[] args) {
		
		int[] arr = {3,8,7,9,10,4,6,5,1};
		
		int minval = IntStream.of(arr).min().getAsInt(); // Find out the min value of an array
		int maxval = IntStream.of(arr).max().getAsInt(); // Find out the max value of an array
		System.out.println(minval);
		System.out.println(maxval);
	 
	}

}
