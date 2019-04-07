package com.Class19;

public class Appplication {

	public static void main(String[] args) {
		
		
		 Animal dog=new Animal();
		  
		 System.out.println(dog.name);
		 System.out.println(dog.breed);
		 System.out.println(dog.age);
		 System.out.println(dog.weight);
		 
		 
		 
		 
		 Animal dog1=new Animal();
		 System.out.println("this is dog2");
		 
		 System.out.println(dog1.name);
		 System.out.println(dog1.breed);
		 System.out.println(dog1.age);
		 System.out.println(dog1.weight);
		 
		 
		 Animal dog3=new Animal();
		  
		 System.out.println(dog3.name);
		 System.out.println(dog3.breed);
		 System.out.println(dog.age);
		 System.out.println(dog.weight);
		 
		 
		 int my_array[]= {1,2,3,4,5,6,7,8};
		 
		 System.out.println("printing the minimum value");
		 System.out.println(Minimum.minOfValues(my_array));
		 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		 System.out.println("printing the maximum value");
		 System.out.println(Minimum.maxOfValues(array));
		}
	
}

