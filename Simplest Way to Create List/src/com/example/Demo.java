package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
	
//		List<String> cities= Arrays.asList("Mumbai","China","Delhi","jalgaon");
//		
//		
//		Collections.sort(cities);
//		System.out.println(cities);
		
//		List<Integer> in= Arrays.asList(10,50,60,70,80,1000);
//		
		
		
		
		List<Student> student = Arrays.asList(
				
				new Student("Gaurav",10,5000),
				new Student("Chaman", 5, 600),
				new Student("Raman", 11, 800));
		
		
		Collections.sort(student,new StudentMarksComp());
		
		System.out.println(student);
		
		
		
		
	}
	
	
}
