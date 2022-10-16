package com.exampl2;

import java.util.Arrays;
import java.util.List;

public class ForEac {
	
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Gaurav","Raman","CHaman" );
		
		names.forEach(n -> System.out.println(n.toUpperCase()));
		
		// with MR 
		names.forEach(System.out::println);
		
	}

}
