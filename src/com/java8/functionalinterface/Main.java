package com.java8.functionalinterface;

public class Main {
	public static void main(String... args) {
		int result = new Calculator() { // Anonymous class
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		}.add(2, 3);
		System.out.println(result);

		// using lamba expression
		Calculator sum = (int x, int y) -> (x + y);
		int num = sum.add(2, 3);
		System.out.println(num);
	}

}
