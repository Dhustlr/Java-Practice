package com.example3;

public class Demo {
	
	
	public static void main(String[] args) {
		
//		
//		Intr i1 = new IntrImpl();
//		
//		i1.sayHello(new Student(10,"Ram", 500));
//		
		
		Intr i2 =  s -> {
			
			System.out.println("Roll is "+ s.getRoll() );
			System.out.println("Marks are "+s.getMarks());
			System.out.println("Name is "+s.getName());
			
		};
		i2.sayHello(new Student(10, "Chama", 5000));
		
	}

}
