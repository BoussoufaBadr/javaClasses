package com.Class11;

public class interviewQuestion2 {

	public static void main(String[] args) {
// Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		
		
		 int arr[] = {0 ,5, 46, 1, 86, 292, 2 ,-1};
	        
	        int min = arr[0];//0
	        int secondLargest = arr[0];//0
	        int largest = arr[0];//0
	        
	        
	        for(int a: arr) {
	            if(a>largest) {
	                largest =a;
	            }
	            if(a < min) {
	                min = a;
	            }
	        }
	        for(int a : arr) {
	            
	            if(a> secondLargest && a <largest) {
	                
	                secondLargest = a;
	            }
	        }
	        System.out.println("min =  "+ min);
	        System.out.println("Second Largest = " + secondLargest);

	        System.out.println("Largest = " + largest);
///////
	        
	        
		/*
		 * for(int i=0; i<arr.length;i++) { if(arr[i]>largest) { largest=arr[i];
		 * 
		 * 
		 * } }
		 */
	    
	
		
		

	}

}
