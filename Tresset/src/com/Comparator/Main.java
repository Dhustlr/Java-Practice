package com.Comparator;

import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) {
		
		
//		StudentMarksComp sc = new StudentMarksComp(); // to access we need to create 
		                                        // object of studentmarkscomp
		
		TreeSet<Student> ts = new TreeSet<>(new StudentMarksComp());
		ts.add(new Student("n1", 50, 1000));
		ts.add(new Student("n2", 40, 9000));
		ts.add(new Student("n3", 30, 8000));
		ts.add(new Student("n4", 20, 7000));
		ts.add(new Student("n5", 10, 6000));
		
		System.out.println(ts);
		
		
	}
	

}
