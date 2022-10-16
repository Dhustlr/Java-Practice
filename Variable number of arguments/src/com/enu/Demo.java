package com.enu;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		 Item[] it =Item.values();
		 
		 for(Item i :it) {
			 System.out.println(i+" price is "+ i.getPrice());
		 }
		  
		
		
	}

}
