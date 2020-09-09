package com.java8.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.stream.Student;

public class ListtoMap{
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(4, "Sukrim"));
		students.add(new Student(2, "Sworaj"));
		students.add(new Student(3, "Krisha"));
		students.add(new Student(1, "John"));
		
		//System.out.println(converttoMap(students));
		
		Map<Integer,Student> maps = converttoMap(students);
		for(Map.Entry<Integer, Student> entry:maps.entrySet()) {
			System.out.println("key is :" +entry.getKey()+"  Values are: "+entry.getValue());
		}
		
		maps.entrySet().stream().forEach(s->System.out.println(s.getKey()+":"+s.getValue()));
	}
	static Map<Integer,Student> converttoMap (List<Student> list){
		Map<Integer,Student> map = list.stream()
									.collect(Collectors.toMap(s->s.getAge(),s->s));
		return map;
		
		
		
	}
}