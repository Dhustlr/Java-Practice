package com.exampe;

public class Student implements Comparable<Student> {
	
	private String name;
	private int roll;
	private int marks;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	
	public Student() {
	
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
//		
//		if(this.getMarks() > s.getMarks()) 
//			return +1;
//		
//		else return -1;   // using this logic the duplicate elements will not be
		                   // removed 
		
		// above statement in single line
		
//		return this.getMarks() > s.getMarks() ? +1 : -1;
		
		// comapring name 
		
		return this.getName().compareTo(s.getName());
		
		
		
		
//		else if (this.getMarks() < s.getMarks())
//			return -1;         // this logic will remove duplicates               
//		else                    
//			return 0;
//		
		
		
	}
	
	
	
	

}
