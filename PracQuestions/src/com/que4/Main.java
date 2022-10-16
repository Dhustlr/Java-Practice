package com.que4;

public class Main {
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		Thread t = new Thread(ta);
		
		t.start();
		synchronized (ta) {		
		    try {
				ta.wait();
				System.out.println("Product from 1 to 10 is: "+ta.p);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

}
	}
}
