package com.java8.test;

import java.util.ArrayList;
import java.util.List;

import com.java8.stream.Student;

public class StreamTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(4, "Sukrim"));
		students.add(new Student(1, "Sworaj"));
		students.add(new Student(1, "Krisha"));
		students.add(new Student(1, "John"));

		students.stream().forEach(s -> {
			int a = s.getAge();
			System.out.println(a);
			System.out.println(s.getFirstName());
		});

		//students.forEach(System.out::println);

		int sum = students.parallelStream()
			.filter(s -> s.getAge() <= 1)
			.map(s -> s.getAge())
			.reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}

}
