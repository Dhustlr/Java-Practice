package com.que6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		
		
		try {
			List<Student> ls = (List<Student>) ois.readObject();
			
			ls.add(new Student(10, "Raam", 1000, "s@gm", 1234545545,new Address("MH", "pune", 54545545)));
			
			for(Student s:ls) {
				System.out.println("Name is "+s.getName());
				
				
				System.out.println("Password is "+s.getPassword());
				System.out.println("Address is "+s.getAddress());
			
			}
			
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
