package com.example;

import java.util.LinkedHashSet;

public class Dmeo {
	
	public static String removeDublicate(String original) {
		
		char[] ch = original.toCharArray(); // converted in character array
		
	    LinkedHashSet<Character> lh = new LinkedHashSet<>(); // to remove 
	                                           // dublicate and mantain sequence
	    
	    for(char chr :ch) {
	    	lh.add(chr);   // iteration to add elements into linked hashset
	    }
	    
	    StringBuilder result = new StringBuilder("");   // because we need string 
	                                             // mutability 
	    
	    for(char c : lh) {
	    	result.append(c); // iteration to append character from linkedhasset 
	    	                  // into stringbuilder
	    }
	    
	    return result.toString(); // to convert into string
		
	}
	
	public static void main(String[] args) {
		
	  String s=Dmeo.removeDublicate("Gaurav");
		
	  System.out.println(s);
		
		
		
	}

}
