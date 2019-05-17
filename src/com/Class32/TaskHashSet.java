package com.Class32;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TaskHashSet {

	public static void main(String[] args) {
		// Create an HashSet of cities and add duplicates into it.
	    //Retrieve all values from HashSet in 2 different ways.
	    //Retrieve all values in alphabetical order.
		
		
		HashSet <String> hst=new HashSet<>();
		hst.add("Fes");
		hst.add("Bakkah");
		hst.add("Andalus");
		
		hst.add("Makkah");
		hst.add("Andalus");
		hst.add("Fes");
		
		
		// way 1:
		
		
		for(String cities:hst) {
			System.out.println(cities);
		}
		
		// way 2:
		
		
		Iterator <String> city=hst.iterator();
		while(city.hasNext()) {
			System.out.println(city.next());
			
		}
		
		ArrayList<String> list=new ArrayList<String>(hst);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
