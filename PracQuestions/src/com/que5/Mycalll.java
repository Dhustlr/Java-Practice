package com.que5;

import java.util.concurrent.Callable;

public class Mycalll implements Callable {

	int num;


	public Mycalll(int i) {
		// TODO Auto-generated constructor stub
		this.num = i;
	}

	
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is findding Product of first " + num + " numbers");

		long product = 1;

		for (int i = 1; i <= num; i++) {
			product *= i;
		}

		return product;

	}

}
