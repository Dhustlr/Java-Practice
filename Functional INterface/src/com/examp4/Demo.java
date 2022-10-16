package com.examp4;

public class Demo {
	
	public static void main(String[] args) {
		
		Intr i1 = new IntrImpl();
		
//		String s = i1.sayHello("Raam");
//		System.out.println(s);
		
//		System.out.println(i1.sayHello("Raam"));
	
		
//		Intr i2 = (String name ) -> {
//			
//			String re = "Welcome using lambda "+name.toLowerCase();
//			
//			return re;
//		};
//		
		//System.out.println(i2.sayHello("Amot"));
		
		
		
		
	 Intr i3 = n -> "Welcome "+n.toUpperCase();

	 
	 System.out.println(i3.sayHello("Gaurav"));
		
		
	}

}
