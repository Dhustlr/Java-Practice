package com.que2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("Raman");
		ls.add("Aman");
		ls.add("Daman");
		ls.add("Gaman");
		ls.add("Chaman");
		ls.add("Naman");
		ls.add("Shaman");
		ls.add("Harman");
		ls.add("Arman");
		ls.add("Barman");
		
		System.out.println("Original List");
		ls.forEach(System.out::println);
		
		
		System.out.println("*******************************");
		
		List<String> uls= ls.stream()
				.filter(s -> s.length()%2==0)
				.map(s->s.toUpperCase())
				.sorted((s1,s2)->s2.compareTo(s1))
				.collect(Collectors.toList());
		
		System.out.println("updated List");
		uls.forEach(s->System.out.println(s));
		
		
	}

}
