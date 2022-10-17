package com.que7;

public class ThreadB extends Thread {
	
	
	int s=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		String n = Thread.currentThread().getName();
		System.out.println(n+" Thread is started");
		
		for(int i=0; i<=10 ;i++) {
			s+=i;
		}
		
		System.out.println(" sum is "+s);
		System.out.println(n+" Thread ended");
		
	}
	

}
