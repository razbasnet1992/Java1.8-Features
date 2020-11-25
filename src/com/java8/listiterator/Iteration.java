package com.java8.listiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/*
 list iterator is fail-fast-if arraylist is modified after creating list iterator
 ConcurrentModificationException is thrown.
 */

public class Iteration {

	public static void main(String[] args) {
		
    ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A","B","C","D"));
    ListIterator<String> list = alphabets.listIterator();
    
    /*ListIterator
     * supports both directions
     * all CRUD operations
     *can be used to iterate only List implemented classes
     */
    System.out.println(list.next());  //A
    System.out.println(list.hasPrevious()); //boolean true
    System.out.println(list.previous()); //previous element A
    System.out.println(list.nextIndex()); //index of A
    System.out.println(list.next());  //subsequent element
   // System.out.println(list.getClass());
    
    list.remove(); //add at index 1
    System.out.println(alphabets);
    System.out.println(list.next());  //prints from original list-B
    System.out.println(list.previous());
    System.out.println(list.previous());
    
	}

}
 