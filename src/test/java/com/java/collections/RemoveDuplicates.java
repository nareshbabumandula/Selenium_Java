package com.java.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Original array
        Integer[] numbers = {11, 13, 21, 13, 27, 21, 22, 84, 99, 11, 19, 22, 21, 84};
        					        
        // Convert the array to a Set to remove duplicates
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));
        
        // Convert the set back to an array
        Integer[] result = uniqueNumbers.toArray(new Integer[0]);
        
        // Display the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}