package com.day5;

public class Student {
	
	
	int roll;
	String name;
    int marks;
    
    
    
    
    
    public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}





	public void showDetails() {
    	
    	System.out.println("roll no is "+roll);
    	System.out.println("Name no is "+name);
    	System.out.println("Marks no is "+marks);
    	
    }

}
