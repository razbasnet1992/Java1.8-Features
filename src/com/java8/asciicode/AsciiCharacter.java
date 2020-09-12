package com.java8.asciicode;

import java.util.Scanner;

public class AsciiCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//to print character from unicode
		System.out.println("Enter number between 69 to 126");
		int num = scanner.nextInt();
		//scanner.close();
		System.out.println((char)num);
		
		//to print ascii code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between Aa to Zz");
		char ch = sc.next().charAt(0);
		sc.close();
		int asciiValue = ch;
		System.out.println(asciiValue);
		
		//for loop for printing characters
		for(int i=0;i<255;i++) {
			System.out.println("The value of "+(char)(i)+" is "+i);
		}
	}
	

}
