package com.java8.mainmethods;

class MainA {
	public static void main(String[] args) {
		System.out.println("Main method in A");
	}

}

class MainB {
	public static void main(String[] args) {

		System.out.println("Main method in B");
		MainA.main(args);
	}
}