package com.Class33;

import java.util.*;
import java.util.Map.Entry;

public class TaskEntry {

	public static void main(String[] args) {
		Map <String,Integer> classroomMap=new LinkedHashMap<>();
		classroomMap.put("table", 20);
		classroomMap.put("chair", 60);
		classroomMap.put("screen", 3);
		classroomMap.put("Student", 20);
		classroomMap.put("Instructor", 20);
		
		System.out.println(classroomMap);
		for(Map.Entry <String, Integer> entry :classroomMap.entrySet()) {
			System.out.println(entry.getKey()+"="+ entry.getValue());
			}
		Iterator<Entry<String, Integer>> classroomIterator =classroomMap.entrySet().iterator();
		while (classroomIterator.hasNext()){
			Map.Entry<String,Integer> entry=classroomIterator.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
			
			
		}
		
	}

}
