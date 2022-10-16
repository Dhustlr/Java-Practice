package com.example;

public class XThread {
	
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new X()::funX);

		t.start();
		
		for(int i=0; i<40; i++) {
			System.out.println("main of XThread "+ i);
		}
	}

}
