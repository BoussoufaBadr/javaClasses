package com.Class11;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		
		
		// 5. Write a java program to reverse String? Reverse a string word by word?
		        
		        
		        
		      /*  
		        String str= "Today is warm day";
		        String reverse="";
		    
		        char[] array=str.toCharArray();
		        
		        for(int i=array.length-1; i>=0;  i--  ) {
		            reverse=reverse+array[i];
		        }
		            
		        System.out.println(reverse);
		        
		        System.out.println("------------------");
		        
		       */ 
		
		        String sentence="The master is speaking";
				String reverse="";
				for (int i=sentence.length()-1;i>=0;i--) {
					reverse=reverse+sentence.charAt(i);
				}
				String[] words=reverse.split(" ");
				for(int i=words.length-1; i>=0;i--) {
					System.out.print(words[i]+" ");
				}
			}
}
		        
		        
		        
		        
		        
		        
		    
	
		
		
		

	


