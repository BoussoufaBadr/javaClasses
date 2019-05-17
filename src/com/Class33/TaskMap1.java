package com.Class33;

import java.util.*;

public class TaskMap1 {

	public static void main(String[] args) {
		
		
	Map<String, String> map=new HashMap<>();
	map.put("Morocco", "Rabat");
	map.put("USA", "DC");
	map.put("GERMANY", "Berlin");
	
	Set <String> keys=map.keySet();
	
	for(String capital:keys) {
		System.out.println(capital+" :"+ map.get(capital));
	
	}
	System.out.println("--------------");
	
	
		Iterator<String> cap=keys.iterator();
		while(cap.hasNext()) {
			String capit=cap.next();
			System.out.println(capit+" : "+ map.get(capit));
		}
		System.out.println("--------------");
		
		
		
		Collection<String> city=map.values();
		
		for( String capitalo:city) {
			System.out.println(capitalo);
			
		}
		
		
		System.out.println("Using iterator--------------");
		
		
		
		Iterator<String> value=city.iterator();
		
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		
	}
		
		
	}


