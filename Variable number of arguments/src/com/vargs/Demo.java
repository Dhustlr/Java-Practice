package com.vargs;

public class Demo {

	public static int add(int[] arr) {
		
		int res =0 ;
		
		for(int i :arr) {
			res+=i;
		}
		
		return res;
		
	}
	
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,40,50,60};
		
		System.out.println(add(arr));
		
		
		
	}
	
	
}
