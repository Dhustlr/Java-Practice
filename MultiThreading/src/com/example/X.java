package com.example;

public class X extends Thread {

	@Override
	public void run() {

		System.out.println("inside run method of X");

		for (int i = 10; i < 20; i++) {
			System.out.println("inside run method " + i);
		}

		System.out.println("end of run method of X");
	}

	public static void main(String[] args) {

		
		System.out.println("inside main of X");
		
		X x = new X();
//		x.run();
		x.start();
		
		

		for (int i = 30; i < 40; i++) {
			System.out.println("inside main " + i);
		}
		System.out.println("End of main");

	}
	
	

}
