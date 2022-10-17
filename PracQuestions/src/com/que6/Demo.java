package com.que6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Student> ls = new ArrayList<>();
		
		
		ls.add(new Student(10, "Raju", 500, "r@gmail", "1234", new Address("Mah", "pune", 42555)));
		ls.add(new Student(20, "Praju", 800, "p@gmail", "567", new Address("MA", "pune", 42555)));
		ls.add(new Student(30, "Sanju", 900, "s@gmail", "289", new Address("CM", "pune", 42555)));
		ls.add(new Student(40, "Anju", 1000, "a@gmail", "2514",new Address("Sm", "pune", 42555)));
		ls.add(new Student(50, "Manju", 580, "m@gmail", "8910", new Address("Hm", "pune", 42555)));
		
		ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("student.txt"));
		
		obs.writeObject(ls);

		obs.close();
		System.out.println("Done with serialization");
		
		
		
		
		
		
	}
	
	
}
