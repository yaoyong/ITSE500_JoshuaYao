/**
 * 
 */
package edu.oit.lesson6;


import java.util.*;
import java.util.Map.Entry;

/**
 * @author JoshuaYao
 *
 */
public class MapIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 88);
		map.put("Lily", 90);
		map.put("Lucy", 92);
		for(Entry<String, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey() + "got" + entry.getValue());
		}
		int max = 0;
		for( int value: map.values()){
			if(value>max){
				max = value;
				}
			}
		System.out.println(max);
		for(String name :map.keySet()){
			System.out.println(name);
		}
		Iterator<Integer> iterator = map.values().iterator();
		
		while(iterator.hasNext()){
			int a = iterator.next();
			if(a>max){
				max = a;
			}
		}
		System.out.println(max);
		Iterator<Entry<String, Integer>> iterator2 = map.entrySet().iterator();
		while(iterator.hasNext()){
			System.out.println("");
		}
		

	}
		

}
