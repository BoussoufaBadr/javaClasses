package com.Class21;

public class Students {
	
	
	String studentName;
	int studentID;
	public static int numberOfStudents;

	public static void main(String[] args) {
	
		/*
Create a Class called Students
Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
*/
		
		Students student1=new Students();
		Students student2=new Students();
		Students student3=new Students();
		
		student1.studentName="john";
		student1.studentID=555;
		student1.numberOfStudents++;
	
		student2.studentName="john";
		student2.studentID=555;
		student2.numberOfStudents++;
		
		student3.studentName="john";
		student3.studentID=555;
		student3.numberOfStudents++;
	
	System.out.println(numberOfStudents);

	}
     void getNumbers() {
    	 
     }
}
