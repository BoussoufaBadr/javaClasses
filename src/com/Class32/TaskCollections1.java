package com.Class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskCollections1 {

	public static void main(String[] args) {
	//1. Create an ArrayList of Strings and using Collections class sort 
		//the values of that ArrayList.
		 
		
		ArrayList<String> alist=new ArrayList<>();
		
		alist.add("tom");
		alist.add("badr");
		alist.add("Anna");
		alist.add("cam");
		Collections.sort(alist);
		System.out.println(alist);
		
		
		//2. Create an array of Strings and using Arrays  
		//class sort the values of that array of Strings.
		
		
		String[] arr= {"Ronaldo","Basir","Shiba","Kamatsho"};
		Arrays.sort(arr);
	    for(String num:arr) {
			System.out.println(num);	
		
	    }	
	}
}
