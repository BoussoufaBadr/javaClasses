package com.Class33;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		// How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
System.out.println(aList);
     
Set<String> hst=new HashSet<String>();
       hst.add("John");
       hst.add("Jane");
       hst.add("James");
       hst.add("Jasmine");
       hst.add("Jane");
       hst.add("James");
  System.out.println(hst);  
	}

}
