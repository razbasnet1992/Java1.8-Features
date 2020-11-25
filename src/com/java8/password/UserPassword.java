package com.java8.password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPassword {
	public static boolean isValidUsername(String username) {

		// Regex to check valid password.
		String regex = "^[a-zA-Z][a-zA-Z0-9_.][@.](!#$%&*()-+=^){8,30}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);
		System.out.println(p);

		// If the password is empty
		// return false
		if (username == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given password
		// and regular expression.
		Matcher m = p.matcher(username);
		System.out.println(m);

		// Return if the password
		// matched the ReGex
		return m.matches();
	}

	public static boolean isValidPassword(String password) {

		// Regex to check valid password.
		String regex = "^[a-zA-Z][a-zA-Z0-9_!@#$%&*()-+=^].{8,30}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);
		// System.out.println(p);

		// If the password is empty
		// return false
		if (password == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given password
		// and regular expression.
		Matcher m = p.matcher(password);
		// System.out.println(m);

		// Return if the password
		// matched the ReGex
		return m.matches();
	}

	// Driver Code.
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username :");
		
		String username = scanner.next();

		System.out.println("Enter password :");
		String password = scanner.next();

		if (isValidUsername(username)) {
			System.out.println("Routing username");
		} else {
			System.out.println("Wrong username");
		}
		if (isValidPassword(password)) {
			System.out.println("Return to home page");
		} else {
			System.out.println("Wrong password");
		}

	}

}
