package com.Class30;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
		 */

		
		
		
		ArrayList <String> names=new ArrayList <String>();
		names.add("john");
		names.add("joe");
		names.add("anna");
		names.add("kerry");
		names.add("lilly");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("joe"));
		System.out.println(names.size());
	    for(String b:names) {
		 System.out.println(b);
	 }
		
		
		
		
		
}
}