package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Demo {
	
	 public static void main(String[] args) {
		
		 
//		 LocalTime lt = LocalTime.now();
//		 
//		 System.out.println(lt);
//		 
//		 LocalDateTime ldt = LocalDateTime.now();
//		 System.out.println(ldt);
//		 
//		 
//		ZonedDateTime zdt = ZonedDateTime.now();
//		System.out.println(zdt);
//		
//		LocalDate dob = LocalDate.of(1995, 8, 29);
//		System.out.println(dob);
		
		
		LocalDate ld = LocalDate.now();
		 
		 System.out.println(ld);
		 
		 LocalDate yesterday = ld.minusDays(1); 
		 System.out.println(yesterday);
		 
		 LocalDate tomorrow = ld.plusDays(1);
		 System.out.println(tomorrow);
		 
		 
		
		 
		 
	}
	

}
