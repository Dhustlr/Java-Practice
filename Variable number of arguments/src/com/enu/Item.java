package com.enu;

public enum Item {

	SALT, SUGAR, OIL, PEN(10), PENCIL(30) ;
	
	
	int price;
	
	private Item() {
		this.price=30; 
	}
	
	private Item(int price) {
		this.price = price;
		
	}
	
	
	public int getPrice() {
		return this.price;
	}
}
