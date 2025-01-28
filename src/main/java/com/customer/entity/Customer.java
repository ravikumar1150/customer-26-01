package com.customer.entity;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Customer {
	
	
	public static void main(String args[]) {
		
		

		String str = "ravikumar";
		
		/*
		 * Set<Character> collect = str.chars().mapToObj(c->(char)c)
		 * .collect(Collectors.groupingBy(c->c,Collectors.counting())) .entrySet()
		 * .stream() .filter(dublicate-> dublicate.getValue()>1) .map(Map.Entry ::
		 * getKey) .collect(Collectors.toSet());
		 * 
		 */
		Set<Character> collect = str.chars().mapToObj(c->(char)c)
		            .collect(Collectors.groupingBy(c->c,Collectors.counting()))
		            .entrySet()
		            .stream()
		            .filter(d-> d.getValue()>1)
		            .map(Map.Entry :: getKey)
		            .collect(Collectors.toSet());
		            
		
		  System.out.println("The Dublicate Character IS : "+collect);
		  
		  
		  
		
	}
}
