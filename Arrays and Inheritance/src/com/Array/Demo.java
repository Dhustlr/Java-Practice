package com.Array;

public class Demo {
	
	
	static void funA(String[] arr) {
 
		if(arr != null) {
		
		for(String s :arr) {
			System.out.println(s.toUpperCase());
		}
		
		}
		else {
			System.out.println("Null not allowed");
		}
	}
	
	public static void main(String[] args) {
		
		String[] names = {"Raam", "Shaam", "Raju"};
		
//		funA(names);   // here we need to pass string array or null;
		
		funA(null);
		
		 
	}

}
