package com.examples;

import java.util.Arrays;

public class Ara {
	
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,80,90,60};
		
//		iterations
//		System.out.println(Arrays.toString(arr));
		
		
		
//		sorting
	
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		// binary Search
		
		
		// to use binary search we need to use sorting algo
		// when element is not there we will get a negative number
		
		int index = Arrays.binarySearch(arr, 30);
		
		System.out.println(index);
		
		
		
		
		
		
		
		
		
	}

}
