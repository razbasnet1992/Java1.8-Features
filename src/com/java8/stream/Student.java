package com.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	private int age;
	private String firstName;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Student(int age, String firstName) {

		this.age = age;
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", firstName=" + firstName + "]";
	}
	
	

}
