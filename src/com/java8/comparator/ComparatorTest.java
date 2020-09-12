package com.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//geeks from geeks comparator

class Movie implements Comparable<Movie> {
	private double rating;
	private int year;
	private String name;
	
	public Movie(String name,double rating, int year) {
		
		this.rating = rating;
		this.year = year;
		this.name = name;
	}

///////
	public int compareTo(Movie m) {
		return (this.year - m.year);
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}
//
}
class Rating implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2) {
		if(m1.getRating()<m2.getRating())
			return 1;
		if(m1.getRating()>m2.getRating())
			return -1;
		else return 0;
	}
}
class Name implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}


public class ComparatorTest {
	public static void main(String...args) {
		ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Force Awakens", 8.8, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        
        Rating r = new Rating();
        Collections.sort(list,r);
        for(Movie m:list) {
        	System.out.println(m.getRating());
        } //
        Name nameMovie = new Name();
        Collections.sort(list, nameMovie);
        System.out.println();
        for(Movie m:list) {
        	
        	System.out.println(m.getName());
        }
        Collections.sort(list);
        for(Movie m:list) {
        	System.out.println(m.getRating());
        }
        
	}

}
