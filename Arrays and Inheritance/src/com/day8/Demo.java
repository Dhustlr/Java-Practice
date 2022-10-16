package com.day8;

import java.util.Scanner;

public class Demo {
	
	
	
	void fun1(Student[] students) {
		
		
		for(Student s1:students) {
		
			System.out.println("Roll is :"+s1.getRoll());
			System.out.println("Name is :"+s1.getName());
			System.out.println("Marks is :"+s1.getMarks());
			
		}
		
		
	}


	public static void main(String[] args) {

		Demo d1 = new Demo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how manu std");
		int num = sc.nextInt();
		
		Student[] st = new Student[num];
		
		for(int i=0; i<st.length;i++) {
			
			System.out.println("Enter Details fo std "+ (i+1));
			
			System.out.println("enter roll");
			int roll = sc.nextInt();
			
			System.out.println("enter name");
			String name = sc.next();
			
			System.out.println("enter marks");
			int marks = sc.nextInt();
			
//			st[i]= new Student(roll, name, marks);
			
			st[i] = new Student();
			st[i].setRoll(roll);
			st[i].setMarks(marks);
			st[i].setName(name);
			
		}
	    d1.fun1(st);
		
		
	}

}

