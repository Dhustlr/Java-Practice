package com.example;

public class Main extends A {
	
	 int x = 20;
	 
	 void funX() {
		 
		 System.out.println("inside funX of Main");
		 
	
	 }
	 
	 public static void main(String[] args) {
		
		 Main m = new Main();
		 
		 System.out.println(m.x);
		  m.funX();
		 
		 // class A

		 System.out.println(m.i);
		  m.funA();
		 
		 
		 
		 
		 
		 
	}
	
	

}
