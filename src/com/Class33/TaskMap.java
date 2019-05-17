package com.Class33;

import java.util.HashMap;
import java.util.Map;

public class TaskMap {

	public static void main(String[] args) {
		Map<Integer,String> ma=new HashMap();
		ma.put(1, "Syntax");
		ma.put(2, "Google");
		ma.put(3, "Microsoft");
		ma.put(4, "amazon");
		ma.put(5, "Ebay");
		ma.put(6, "Lyft");
		ma.put(7, "Uber");
		System.out.println(ma.size());
		ma.replace(4, "hdepot");
		ma.remove(7);
		System.out.println(ma);
		
		
		
		
	}

}
