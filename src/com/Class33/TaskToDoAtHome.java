package com.Class33;

import java.util.*;
import java.util.Map.Entry;

public class TaskToDoAtHome {

	public static void main(String[] args) {
		// Create a map of Best Buy store. Place
		//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		//Print all keys and values from a Best Buy map using EntrySet.
		
		
		Map<Integer,String> BestBuy=new LinkedHashMap();
		BestBuy.put(123, "laptop");
		BestBuy.put(456, "Ipad");
		BestBuy.put(789, "Iphone");
		System.out.println(BestBuy);
		BestBuy.entrySet();
		
		for(Map.Entry<Integer, String> item:BestBuy.entrySet()) {
			System.out.println(item.getKey()+"="+ item.getValue());
		}
		System.out.println("---------------------");
		
		Iterator<Map.Entry <Integer, String>> it=BestBuy.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String>items=it.next();
			System.out.println(items.getKey()+"="+ items.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
