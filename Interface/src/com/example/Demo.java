package com.example;

public class Demo {
	
	
	public Hotel provideFood(int amount) {
		
		Hotel h = null;
		
		
		
		if(amount >500) {
			
			h = new TajHotel();
 
			
		}
		else if(amount <500 && amount >200) {
			h= new RoadSideHotel();
		}
		
		return h;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		Hotel h1 = d.provideFood(400);
		
		System.out.println(h1);  // address
		
		if (h1!=null) {
		
		
		h1.ChickenBiryani();
		h1.MasalaDosa();
		
		TajHotel tj =(TajHotel) h1;
		tj.SpecialMasala();
		
		
		}else {
			System.out.println("amnt must be greater than 200");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
