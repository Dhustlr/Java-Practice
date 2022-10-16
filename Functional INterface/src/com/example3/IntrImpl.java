package com.example3;

public class IntrImpl implements Intr {

	@Override
	public void sayHello(Student student) {
	
	System.out.println("roll is " +student.getRoll());
	System.out.println("marks are "+student.getMarks());
	System.out.println("name is "+student.getName());
		
	}
	
	

}
