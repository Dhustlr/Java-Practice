package com.example2;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		// longest implemetation of LE
		Intr i1 = (String name, int age) -> {
			
			System.out.println("Inside Lamba "+name + " age is " +age);
			
		};
		
		i1.sayHello("Raman", 20);
		
		
		
		// Short Implemenataion

		Intr i2 = (n,a) -> System.out.println("Inside Lamba short "+ n +" age is "+ a);
		
		i2.sayHello("Chaman", 55);
		
		
		
		
	}
	

}
