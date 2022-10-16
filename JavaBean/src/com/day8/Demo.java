package com.day8;

public class Demo {
	
	
	Student [] getStudent(String name, String pass) {
		
		if(name.equalsIgnoreCase("admin")&& pass.equalsIgnoreCase("123") ) {
			
			 Student[] std = std = new Student[3];
			 
			 std[0] = new Student("Gaurav", 10, 500);
			 std[1] = new Student("rama", 50, 800);
			 std[2] = new Student("Chamam", 5, 900);
			
			 return std;
			 
		}
		else {
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Student[] s1 = d1.getStudent("admin","123");
		
		if(s1!=null) {
			
			// enhance loop
			
//			for(Student i: s1) {
//				System.out.println("Roll no is "+ i.getName());
//				System.out.println("marks is "+i.getMarks());
//				System.out.println("Name is"+ i.getName());
//			
//			}
			
			// normal loop 
			
			for(int i =0; i<s1.length;i++) {	
				
				System.out.println("Roll no is "+s1[i].getMarks());
				System.out.println("marks is "+s1[i].getName());
				System.out.println("Name is"+ s1[i].getRoll());
			  
			}
			
			
			
		}
		else System.out.println("Please enter valid input and output");
		
	}
   
}
