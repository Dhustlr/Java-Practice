package com.que5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Mycalll[] jobs = {
				
				new Mycalll(5),
				new Mycalll(10),
				new Mycalll(25),
				new Mycalll(55),
				new Mycalll(65),
			
		};
		

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (Mycalll c : jobs) {

			Future ans = service.submit(c);

			System.out.println(ans.get());

		}
		service.shutdown();

	}

}
