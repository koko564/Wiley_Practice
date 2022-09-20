package com.collection;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeDemo {
	 public static void main(String[] args) {
	        // Creating TreeMap of even numbers
	        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

	        // Using put()
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);

	        // Using putIfAbsent()
	        evenNumbers.putIfAbsent("Nine", 9);
	        System.out.println("TreeMap of even numbers: " + evenNumbers);
	        evenNumbers.putIfAbsent("Nine", 9);
	        System.out.println("TreeMap of even numbers: " + evenNumbers);

	        //Creating TreeMap of numbers
	        TreeMap<String, Integer> numbers = new TreeMap<>();
	        numbers.put("One", 1);
//
//	        // Using putAll()
	        numbers.putAll(evenNumbers);
	        System.out.println("TreeMap of numbers: " + numbers);
	        
	        
//	        Hashtable<Integer, Integer> hashtable=new Hashtable<Integer, Integer>();
//	        hashtable.pu
	    }

}