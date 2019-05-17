package com.Class34;

import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, Person> personInfo=new HashMap<>();
		personInfo.put(1,new Person("Mark","smith",35,60000));
		personInfo.put(2,new Person("john","smith",32,70000));
		personInfo.put(3,new Person("ana","smith",38,80000));
		personInfo.put(4,new Person("keevin","smith",39,90000));
		
		
		Collection< Person> info=personInfo.values();
		for(Person infoAll:info) {
			infoAll.printpEersonDetails();
		}
	}

}
