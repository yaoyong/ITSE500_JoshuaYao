package edu.oit.lesson6;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		Integer i = new Integer(1);
		Double m = new Double(4.1);
		i = i.valueOf(2);
		
		hashMap.put(i, "this is integer");
		hashMap.put(m, "this is double");
		hashMap.put("Spring", "´º");
		hashMap.put("Summer","ÏÄ");
		hashMap.replace("Summer", "Summer");
		System.out.println(hashMap.values());
		System.out.println(hashMap.keySet());
		if (hashMap.containsKey("Spring")){
		System.out.println(hashMap.get("Spring"));
		}else{
		System.out.println(hashMap.values());
		}

	}

}
