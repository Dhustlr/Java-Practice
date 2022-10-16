package com.example;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Intr i1 = new IntrImpl();
		i1.sayHello("Gaurav");
		
		
		// anonymous inner class
		Intr i2 = new Intr() {

			@Override
			public void sayHello(String name) {
				 System.out.println("Welcome using annonymous inner class "+name);	
			}
		
		};
		i2.sayHello("Ram");
		
		
		// using Lambda Expression;
		
		Intr i3 = n -> System.out.println("Welcome using Lambda Expression " +n);
		
		i3.sayHello("Sham");
	}

}
