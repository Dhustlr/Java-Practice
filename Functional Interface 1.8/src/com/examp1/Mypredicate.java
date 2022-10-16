package com.examp1;

import java.util.function.Predicate;

public class Mypredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		
		return i >0;
		
	}

	
}
