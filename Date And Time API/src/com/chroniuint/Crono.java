package com.chroniuint;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Crono {
	
	
	public static void main(String[] args) {
		
		LocalDateTime old = LocalDateTime.of(1995,8,29,04,45,00);
		
		LocalDateTime newdate = LocalDateTime.of(2022,10,2,10,5,55);
		
		System.out.println(old);
		System.out.println(newdate);
		
		System.out.println(ChronoUnit.YEARS.between(old, newdate));
		System.out.println(ChronoUnit.DAYS.between(old, newdate));
		
		
		
		
	}

}
