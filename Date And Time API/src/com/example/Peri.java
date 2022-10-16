package com.example;

import java.time.LocalDate;
import java.time.Period;

public class Peri  {
	
	
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		
		LocalDate dob = LocalDate.of(1995, 8, 29);
		
		Period diff = Period.between(ld,dob);
		
		System.out.println(diff);
		
		
		
		
		
	}

}
