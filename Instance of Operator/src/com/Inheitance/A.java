package com.Inheitance;

public class A {
	
	public Object trail(int x) {
		
		System.out.println("Class A");
		
		return new Demo();
		
	}
	
	
	public static void main(String[] args) {
		
//		
//		A a1 = new A();
//		
//		a1.trail(10);
		
		A d = new Demo();
		
		d.funB();
		
		
		
		
	}

}
