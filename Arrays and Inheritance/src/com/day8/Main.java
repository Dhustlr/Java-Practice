package com.day8;

public class Main {
	
	
	public static void main(String[] args) {
		
		A[] arr = new A[3];
		
		arr[0] = new A();
		arr[1] = new A();
		arr[2] = new A();
		
		for(A i: arr) {
		i.funA();
			
		}
		
		
		
		
	}

}
