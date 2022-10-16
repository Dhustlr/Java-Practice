package com.example;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

//		List<String> ls = Arrays.asList("one","two","three","four");
//		
//		Stream<String>str = ls.stream();
//		
//		str.forEach(s -> System.out.println(s.toUpperCase())); // terminal method  
//		// whever any terminal method is called your string will be consumed

		// **********************************************************************

		List<Student> std = new ArrayList<>();

		std.add(new Student(10, "Ram", 500));
		std.add(new Student(20, "Aam", 1500));
		std.add(new Student(30, "Sham", 2500));
		std.add(new Student(40, "Sudar", 3500));

//		Stream<Student> s = std.stream();// 
//
//		         // predicate obj            
//		Stream<Student> s1 = s.filter(st -> st.getMarks() < 3000);
//		
//		s1.forEach(s2 -> System.out.println(s2));

		// chaining method and most recommended method
//		std.stream()
//		.filter(s-> s.getMarks() < 3000)
//		.forEach(s -> System.out.println(s));
//		

		// using map

//		Stream<Student> st = std.stream();
//		
//		
//		List<Student> st1 = st.map(s -> new Student(s.getRoll()+50,s.getName(),s.getMarks()+50) ).collect(Collectors.toList());
//		
//		
//		st1.forEach(s -> System.out.println(s));

		// filtering the list;

//         List<Student> student=		std.stream().filter(s-> s.getMarks() < 3000).map(s -> new Student(s.getRoll(), s.getName(), s.getMarks())).collect(Collectors.toList());
//		
//         student.forEach(s-> System.out.println(s));
//		
//		

		// Optional Method min() and max();

//	Optional<Student> std1	= std.stream().max((s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
//	
//	Student maxstd = std1.get();
//	System.out.println(maxstd);
//	

		// count() method;

		long n = std.stream().filter(s -> s.getMarks() < 3000).count();
		System.out.println(n);
		
	
		// allMatch(), anyMatch(), nonMatch();
	
		
		
		boolean b = std.stream().anyMatch(s -> s.getMarks() < 3000);
		
		System.out.println(b);
		
		
		//summingInt;
		
		int i = std.stream().collect(Collectors.summingInt(s -> s.getMarks()));
		System.out.println(i);
		
	}

}
