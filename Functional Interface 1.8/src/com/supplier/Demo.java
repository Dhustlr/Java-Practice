package com.supplier;

import java.util.function.Supplier;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Supplier<String> sp = new Supp();
		
		String s= sp.get();
		System.out.println(s);
		
		Supplier<String> s1 = () -> {
			return "This Message from LE";
		};
		
		String s2 = s1.get();
		System.out.println(s2);
 		
	}

}
