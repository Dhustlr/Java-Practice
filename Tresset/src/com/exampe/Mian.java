package com.exampe;

import java.util.TreeSet;

public class Mian {
	
	public static void main(String[] args) {
		
//		TreeSet<Student> ts = new TreeSet<>();
//		
//		ts.add(new Student("n1", 10, 100));
//		ts.add(new Student("n2", 20, 200));
//		ts.add(new Student("n4", 30, 300));
//		ts.add(new Student("n3", 40, 400));
		
//		System.out.println(ts); // class caste exception 
		                        // we need to implement comparable and override
		                        // compareTo method 
		
//	     
//		System.out.println(ts);
//		System.out.println(ts.size());  // 5
//		
		
		TreeSet<Student> ts = new TreeSet<>();
//		
		ts.add(new Student("n1", 10, 100));
		ts.add(new Student("n2", 20, 200));
		ts.add(new Student("n4", 30, 400));
		ts.add(new Student("n3", 40, 400));
		
		System.out.println(ts);
		System.out.println(ts.size());  // 3  duplicates are not allowed
		
		
	}

}
