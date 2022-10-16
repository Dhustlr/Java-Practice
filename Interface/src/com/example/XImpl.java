package com.example;

public class XImpl implements X {

	@Override
	public void funA() {
		// TODO Auto-generated method stub
		
		System.out.println("inside funA");
		
	}

	@Override
	public void funB() {
		// TODO Auto-generated method stub
		
		System.out.println("inside funB");
		
	}
	
	
	public void fun3() {
		
		System.out.println("inside fun3");
	}
	
	
	public static void main(String[] args) {
		
		X x = new XImpl();
		
		x.funA();
		x.funB();
	
		XImpl x1=(XImpl)x;  // downcasting
		x1.fun3();
//		x.x;
		System.out.println(x.x);
		System.out.println(x1.x);
		System.out.println(X.x);
	}
	
	

}
