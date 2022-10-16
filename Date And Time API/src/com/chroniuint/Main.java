package com.chroniuint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
	
	
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate dd = ld.plus(3,ChronoUnit.MONTHS);
		System.out.println(dd);
		
		
		
	}

}
