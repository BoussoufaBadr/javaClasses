package com.Class21;

public class Employee {
	
/*
 Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */
	
	static String Ceo="Sumair";
     int salary;
     int eID;

     public static void main(String[] args) {
    	 
     
    	 Employee emp=new Employee();
    	 Employee emp1=new Employee();
    	 
    	 
    	 
    	 emp.salary=4000;
    	 emp.eID=123;
    	 emp.getCompany();
    	 
    	 emp1.salary=5000;
    	 emp1.eID=456;
    	 emp1.getCompany();
    	 
    	 
    	 
    	 
    	 
     } 
    	 void getCompany() {
    		 System.out.println("The eID is "+ eID + " the salary is "+ salary+ " and the Ceo is "+ Ceo);
    		 }
    	 }
    	 
    	 