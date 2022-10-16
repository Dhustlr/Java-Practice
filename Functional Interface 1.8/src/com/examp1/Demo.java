package com.examp1;

import java.util.function.Predicate;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = new Mypredicate();
		System.out.println(p.test(-10)); // false
		
		                           // condition to check 
		Predicate<Integer> p1 = i -> i > 0;
		System.out.println(p1.test(10));// true
		
	}

}
