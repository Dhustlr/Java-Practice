package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSe {
	
	
	public static void main(String[] args) {
		
		
//		
//		hs.add(10);
//		hs.add(10);
//		hs.add(20);
//		hs.add(30);
//		hs.add(140);
//		hs.add(50);
//		
//		System.out.println(hs);
//		
		
		
		 // LONG METHOD
		ArrayList<Integer> al = new ArrayList<>();
	
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(140);
		al.add(50);
		
		
		HashSet<Integer> hs = new HashSet<>(); // to remove dublicates but using it
		                                       // will disturb sequence
		
		
//		LinkedHashSet<Integer> lh = new LinkedHashSet<>();// dublicates removed
//		                                           // and sequence is preserved
//		
//		for(Integer i :al) {
//			lh.add(i);
//		}
//		
//		System.out.println(lh);
		
		
		

		// SHORTCUT METHOD
		LinkedHashSet<Integer> lh = new LinkedHashSet<>(al);
    
		System.out.println(lh);
		
		al = new ArrayList<>(lh); // again all the data transfered to arraylist 
		
		System.out.println(al);
		
		
	}
	
	
	   

}
