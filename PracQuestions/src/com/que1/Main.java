package com.que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<>();
		ls.add(new Student(10, "Raman", 450, "Shimla"));
		ls.add(new Student(20, "Aaman", 550, "Manila"));
		ls.add(new Student(30, "Chaman", 650, "Kerala"));
		ls.add(new Student(40, "Daman", 350, "Wadala"));
		ls.add(new Student(50, "Shaman", 850, "Lokhandwala")); 
		
		
		
		List<Employee> fls = ls.stream()
				.filter(s-> s.getMarks() > 500 )
				// using map we assigned all the values from Student class to Employee Class
				.map(i-> new Employee(i.getRoll(), i.getName(), i.getMarks()*10000, i.getAddress()))
				.collect(Collectors.toList());
		
		fls.forEach(s->System.out.println(s)); // filtered list;
		
		System.out.println("******************************************");
		
		fls.forEach(System.out :: println);
	
		
	}

}
