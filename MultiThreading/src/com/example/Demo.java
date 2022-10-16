package com.example;

public class Demo {
	
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
//		ThreadB tb = new ThreadB();
		
		
		// multiple thread with one object 
		Thread tr1 = new Thread(ta);
		Thread tr2 = new Thread(ta);
		
		tr1.setName("Gaurav ");
		tr2.setName("Yukku ");
		
		tr1.start();
		tr2.start();
		
		// changing main thread name
		Thread.currentThread().setName("Ramta Jogi");
		
		System.out.println("Inside main thread " + Thread.currentThread().getName());
		
	}
	
	

}
