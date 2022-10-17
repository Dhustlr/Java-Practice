package com.que7;

public class ThreadA extends Thread{
	
	
	ThreadC c;
	
	public ThreadA(ThreadC obj) {
		
		this.c = obj;
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String n = Thread.currentThread().getName();
		System.out.println(n+" Thread is started");
		
		for(int i=0 ;i<=10;i++) {
			System.out.println(n +" is runnig "+i);
		}
		
		System.out.println(n+" thread is ended");
		
	}

}
