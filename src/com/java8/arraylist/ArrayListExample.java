package com.java8.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(4); 
        al.add(5);
        al.remove(2);
        System.out.println(al);
	}

}
