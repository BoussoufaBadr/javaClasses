package com.Class11;

public class ManipulationTsk2 {

	public static void main(String[] args) {
		
		/*
		Create a String that will hold a sentence. Write a program to get a new String without any spaces.
Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.

You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” How would you find out how many sentences are in that String?
		
			*/
		
		
		
		
		
		String str="I am really confused";
	     String newStr=str.replace(" ", "");
        System.out.println(newStr);
		
	
        
        
        
        
        String str1="I am #$@& really 1223 confused";
	     String newStr1=str1.replaceAll("[a-zA-Z]", "");
       System.out.println(newStr1.length());
		
       
       
       
         String a= "Is it saturday! Is it raining! Do we have a Java Class today?";

	      String[]array=a.split("!");
          System.out.println(array.length);
}
}