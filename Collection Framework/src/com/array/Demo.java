package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> students= new ArrayList<>();
	    
		int c =1;
		
		while(true) {
			
			System.out.println("Enter Details of Student "+(c++));
			
			System.out.println("Enter roll");
			int r = sc.nextInt();
			
			System.out.println("Enter name");
			String n = sc.next();
			
			System.out.println("ENter Marks");
			int m = sc.nextInt();
			
			
			//**************************************************************
			Student student = new Student(r, n, m);
			students.add(student);
			//*******************************************************
			
			
			
			
			System.out.println("Studenet object added successfully");
			
			
			System.out.println("Want to add more Y/N");
			
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("n")) 
				break;
			
		}
		
//		for(Student student :students) {
//			System.out.println(student); // overrided toString method will be printed 
//			System.out.println("roll no is "+student.getRoll());
//			System.out.println("marks are "+student.getMarks());
//			System.out.println("Name is "+student.getName());
//		}
//		
		
		for(int i=0;i<students.size();i++) {
			Student student = students.get(i); // in array we can't use normal loop directly so 
			                                   // we need to get index into student object.
			
			System.out.println("roll no is "+student.getRoll());
			System.out.println("marks are "+student.getMarks());
			System.out.println("Name is "+student.getName());
			
			
			
		}
		
		
	}

}
