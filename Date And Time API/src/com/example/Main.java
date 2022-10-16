package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	
	public static void main(String[] args) {
		
		String dob = "20/02/1995";
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate ld = LocalDate.parse(dob,dtf);
		
		LocalDate ld = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(ld);
		
		
		
		
	}

}
