package com.collection;

import java.util.TreeMap;

public class TreeMapDemo2 {
	 public static void main(String[] args) {
	        TreeMap<String, Integer> numbers = new TreeMap<>();
	        numbers.put("First", 2);
	        numbers.put("Second", 3);
	        numbers.put("Aloha", 4);
	       numbers.put("Zen", 5);
	        System.out.println("TreeMap: " + numbers);
	        
	        

	        // Using the firstKey() method
	        String firstKey = numbers.firstKey();
	        System.out.println("First Key: " + firstKey);

	        // Using the lastKey() method
	        String lastKey = numbers.lastKey();
	        System.out.println("Last Key: " + lastKey);

	        // Using firstEntry() method
	        System.out.println("First Entry: " + numbers.firstEntry());


	        // Using the lastEntry() method
	        System.out.println("Last Entry: " + numbers.lastEntry());
	    }

}