package com.vargs;

public class example2 {
	
	public static int add(int... arr) {  // spread operator 
		
		int res =0;
		 
		for(int i :arr) {
			res+=i;
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		
//		int[] arr = {10,50,40,60,70};
		
		System.out.println(add(10,30,50,60));
		
	}
	
	
	

}
