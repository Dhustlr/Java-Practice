package com.exam3;

public class A implements Runnable {

	int sum;
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("inside run of A"+i);
			sum+=i;
			
		}
		
	}
	
	

}
