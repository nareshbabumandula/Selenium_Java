package com.java.collections;

import java.util.*;

/**
 * HashSet implements Set interface
 * It does not allow duplicate elements, it contains only unique elements
 * It does not follow insertion order
 * It uses hash table for storage of elements
 * */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();

        s1.add("Ramya");
        s1.add("Seerath");
        s1.add(null);
        s1.add(null);
        s1.add("Ramya");
        System.out.println(s1);
        
        s2.add("Ravi");
        s2.add("Venkat");
        s2.add(null);
        s2.add(null);
        s2.add("Ravi");
        System.out.println(s2);
        
        s3.add("Shyam");
        s3.add("Arun");
        s3.add("Juweria");
        //s3.add(null);  // NullPointerException
        s3.add("Shyam");
        System.out.println(s3);


        HashSet<String> set = new HashSet<String>();
        set.add("ravi");
        set.add("ram");
        set.add("teju");
        set.add("ravi");
        set.addAll(s1);


        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
