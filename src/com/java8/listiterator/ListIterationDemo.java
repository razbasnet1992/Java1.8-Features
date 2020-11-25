package com.java8.listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterationDemo {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
         al.add("test");
         al.add("ref");
         al.add("raj");
         al.add("bas");
         al.add("it");
         
         Iterator<String> ltr= al.iterator();
        // System.out.println(al.get(3));
         while(ltr.hasNext())
         {
        	
        	 System.out.println(ltr.next());
        	// System.out.println(ltr.next());
        // if(index ==3){
         		
         
        
	}
        // System.out.println();
       
	}
}
