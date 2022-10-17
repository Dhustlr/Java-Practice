package com.que7;

public class ThreadC extends Thread {

	ThreadB b;

	public ThreadC(ThreadB ob) {
		// TODO Auto-generated constructor stub
		this.b = ob;
	}

	int p = 1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String n = Thread.currentThread().getName();
		System.out.println(n + " Thread is started");

		for (int i = 0; i <= 10; i++) {
			p *= i;
		}

		System.out.println(" product is " + p);
		System.out.println(n + " Thread ended");

	}
}
