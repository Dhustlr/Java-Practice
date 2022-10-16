package com.exam3;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		A a1 = new A();
		Thread tr = new Thread(a1);
		
		tr.start();
		tr.join();
		
		for(int i=0;i<10;i++) {
			System.out.println("inside main of demo "+i);
			System.out.println(a1.sum);
			
		}
		
		
	}

}
