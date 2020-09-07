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
		
	}
}
