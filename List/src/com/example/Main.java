package com.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
	
	
public static List<String> removeDublicateFromList(List<String> cities) {
	            
	         LinkedHashSet<String> lh = new LinkedHashSet<>(cities);
	         
	         return new ArrayList<>(lh);
	}
	
	public static void main(String[] args) {
		
	  List<String> s = new ArrayList<>();
		
		s.add("delhi");
		s.add("mumbai");
		s.add("delhi");
		s.add("pune");
		s.add("gujarat");
		
		System.out.println(s);
		
		
		List<String> ls=Main.removeDublicateFromList(s);
		
		System.out.println(ls);
	}

	

}
