package com.example;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<20; i++) {
			
			String name = Thread.currentThread().getName();
			System.out.println(name +"is running in threadA" +i);
			
		}
		
		System.out.println("end of thread A");
		
	}

}
