package com.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		
		
		ArrayList<String> alist=new ArrayList<>();
		alist.add("toyota");		
		alist.add("honda");
		alist.add("BMW");
		System.out.println(alist);
		
		
	for(int i=0; i<alist.size();i++) {
		System.out.println(alist.get(i));
	}
		
		for(Object cars: alist){
			System.out.println(cars);
			}
		
	Iterator<String> b = alist.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("use");		
		list.add("move");
		list.add("play");
		System.out.println(list);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String word= it.next();
			if(word.endsWith("e")) {
				it.remove();
				
			}
		}
		System.out.println(list);
	
        ArrayList<String> drink=new ArrayList<String>();
          drink.add("coca");		
          drink.add("sprite");
          drink.add("lemonade");
          System.out.println(drink);
          
          
          
          ArrayList<String> drinks=new ArrayList<>();
  		drinks.add("tea");
  		drinks.add("coffee");
  		drinks.add("milk");
  		drinks.add("soda");
  		
  		for (int i=0; i<drinks.size(); i++) {
  			String d=drinks.get(i);
  			if(drink.contains("a") || d.contains("e")) {
  				drinks.set(i, "water");
  			}
  		}
  		System.out.println(drinks);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
          
          
          
          
	}}

