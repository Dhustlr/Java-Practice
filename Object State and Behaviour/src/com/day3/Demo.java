package com.day3;

public class Demo {
	
	//State of Object
	String title;  
	String Artist;
	
	
	// Behaviour of object
	void play () {
		
		System.out.println(Artist+" is singing "+title);
	}
	
	
	public static void main(String[] args) {
		
		Demo d1= new Demo();
		
		d1.Artist="LATA";
		d1.title ="Vande Mataram";
		
		d1.play();
		
		
		
		
	}

}
