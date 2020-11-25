package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateInterface {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rajendra","Basnet","Sworaj","Basnet");
		
		Predicate<String> predicate = s->s.startsWith("S"); //
		
		for(String name:names) {
			if(predicate.test(name)) {//functional interface cause of 'test'inbuilt method
				System.out.println(name);
			}
		}
	}
	

}
