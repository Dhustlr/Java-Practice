package com.Array;

public class Array2D {
	
	
	public static void main(String[] args) {
		
		
		// for loading values in array we have to always use normal forloop
		
		int [][] arr = new int[4][4];
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				arr[i][j]=j;
				
			}
			
		}
		

//		for(int[] ar: arr) { 
//		    
//			for(int i1 :ar) {
//				
//				System.out.print(i1);
//			
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
