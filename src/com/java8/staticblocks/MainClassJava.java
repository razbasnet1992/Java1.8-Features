package com.java8.staticblocks;

class StaticMethod {
	public static String str = "Static field";
	//System.out.println(str);

	
	//static block executed first
	static {
		System.out.println("Inside static block");
	}
	
}

public class MainClassJava{
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
		//StaticMethod obj = new StaticMethod();
		System.out.println(StaticMethod.str);
		//
		//
//
	}
}
