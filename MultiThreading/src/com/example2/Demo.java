package com.example2;

public class Demo implements Runnable {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Demo d = new Demo();
		
		Thread tr = new Thread(d);
		
		tr.start();
		tr.setPriority(10);
		tr.getPriority();
		
		Thread.sleep(5000);
		
		System.out.println("End of main()");
		
	}

	@Override
	public void run() {
		
		for(int i=0;i<20;i++) {

			
			System.out.println("Inside demo of run method "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
	
		System.out.println("End of run");
		
	}
	

	
}
