package com.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
	

	    /*
	     * Complete the 'diagonalDifference' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */
	    

	    public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	    int p =0;
	    int s =0;
	    for(int i=0;i<arr.size();i++){
	        for(int j=0;j<arr.size();j++){
	            if(i ==j){
	                p = p+arr.get(i).get(j);
	            }
	             if(i+j==(arr.size()-1)){
	                s = s +arr.get(i).get(j);
	            }
	        }
	    }
	    return s-p;

	    }
public static void main(String[] args) {
    List<List<Integer>> arr = new ArrayList<>();
   
    arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
    arr.add(new ArrayList<Integer>(Arrays.asList(4,6,6)));
    arr.add(new ArrayList<Integer>(Arrays.asList(1,8,4)));
    
   // diagonalDifference(arr);
    System.out.println( diagonalDifference(arr));
    String s = "100";
    int n = Integer.parseInt(s);
    System.out.println(n);
}
	}


