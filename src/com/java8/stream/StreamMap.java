package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,5,6,3,9);
		List<Integer> square = list.stream().map(s->s+2).collect(Collectors.toList());
		
		
		System.out.println(square);
		
		List<Integer> filterData = list.parallelStream().filter(s->s>5).collect(Collectors.toList());
		System.out.println(filterData);
		
		String string = "Item1 10 Item2 25 Item3 30 Item4 45";
		 
		Integer sum = Arrays.stream(string.split(" "))
		    .filter((s) -> s.matches("\\d+"))
		    .mapToInt(Integer::valueOf)
		    .sum();
		System.out.println(sum);
	}
}
