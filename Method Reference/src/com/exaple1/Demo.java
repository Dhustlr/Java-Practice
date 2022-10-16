package com.exaple1;

public class Demo {
	
	public static void fun1(String s) {
		
		System.out.println("Inside static fun1 of demo");
		System.out.println("The value of s is "+ s);
		
	}
	
	
	
	public void fun2(String s) {
		
		System.out.println("Inside nonstatic fun2 of Demo");
		System.out.println("The value of s "+s);
		
	}
	
	
	
	public Demo(String s) {
		System.out.println("Inside constructor of Demo");
		System.out.println("The value of s "+s);
		
	}
	
	public static void main(String[] args) {
		
//		
		Intr i1 =  message -> System.out.println(message);
		
		i1.sayHello("Welcome to LE");
		
		//method reference
		
		Intr i2 = Demo::fun1;
		i2.sayHello("Welcome to MR");
//		
		// o/p
		
		//Inside fun1 of demo
        //The value of s is Welcome to MR
		
		
		
		// calling non static method
	
		Intr i3 = new Demo("Raam")::fun2;
		i3.sayHello("Welcome to nonstatic MR");
	
//		//or
//		
		Demo d1 = new Demo("Rahul");
		Intr i4 = d1::fun2;
		i4.sayHello("Welcome with shortcut nonstatic MR");
//		
		//op
		//Inside nonstatic fun2 of Demo
//		The value of s Welcome to nonstatic MR
		
		
		// constructor ref
		
		Intr i5 = Demo::new;
		i5.sayHello("Welcome inside constructor");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
