package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter DOB in dd-MM-yyyy format");
		String dob = sc.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate date = LocalDate.parse(dob,dtf);
		
		String res = date.format(DateTimeFormatter.ofPattern("EEEE"));
		
		System.out.println("Your Birthday day is " +res);
		
		
	}

}
