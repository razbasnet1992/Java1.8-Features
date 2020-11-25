package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxmimumNumber {
	public static void main(String[]args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Integer max = list.stream().mapToInt(s->s).max().orElseThrow(NoSuchElementException::new);
		System.out.println(max);
		
		Integer sum = list.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
	}

}
