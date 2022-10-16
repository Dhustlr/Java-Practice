package com.que4;

public class ThreadA implements Runnable {

	int p =1;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			 for(int i=1;i<=10;i++) {
		    	 p*=i;
		       }
//			 this.notify();
			
		}
	}

	
}
