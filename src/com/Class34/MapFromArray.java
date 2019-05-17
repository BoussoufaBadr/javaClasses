package com.Class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

    public static void main(String[] args) {
                        // 1        2        3        4        5            6
        String[] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
        
        Map<Integer, String> nameMap=new LinkedHashMap<>();
        
        int key=1;
        
        for(String name:names) {
            nameMap.put(key, name);
            key++;
        }
        System.out.println(nameMap);
        //print key and values using entrySet(loop && Iterator)
        
        
        for(Map.Entry < Integer,String> entry :nameMap.entrySet()) {
			System.out.println(entry.getKey()+"="+ entry.getValue());
			}
        
        System.out.println("-----------------------");
        
        Iterator<Map.Entry < Integer,String>> it= nameMap.entrySet().iterator();
        
        while(it.hasNext()) {
        Map.Entry name=it.next();
        System.out.println(name.getKey()+"="+name.getValue());
        }
    }
}