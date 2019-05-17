package com.Class33;

import java.util.*;
class Main {
 public static void main(String[]args){
   
   Map<String,Integer> map=new HashMap<String,Integer>();
   map.put("Shiva",222);
   map.put("Sandish",333);
   map.put("Asel",555);
   map.put("Sumair",666);
   
   
  Set <String> keys=map.keySet();
   
Iterator<String> k=keys.iterator();

while(k.hasNext()){
  String b=k.next();
  System.out.println(b + map.get(b));
  
}
}
}