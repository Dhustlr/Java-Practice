package com.ex;

public class Demo {
	
	public void fun(Special spc) {
		
		System.out.println("Here we have special behaviour");
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.fun(new Marker());
		
		
	}

}
