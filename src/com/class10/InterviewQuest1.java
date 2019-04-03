package com.class10;

public class InterviewQuest1 {

	public static void main(String[] args) {
		
		//5. Write a java program to reverse String? Reverse a string word by word?
		
		
		
		
		String str= "Today is warm day";
		String reverse="";
	
		char[] array=str.toCharArray();
		
		for(int i=array.length-1; i>=0;  i--  ) {
			reverse=reverse+array[i];
		}
			
		System.out.println(reverse);
	}
}
