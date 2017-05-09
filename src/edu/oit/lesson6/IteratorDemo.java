/**
 * 
 */
package edu.oit.lesson6;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author JoshuaYao
 *
 */
public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("SF");
		set.add("ny");
		set.add("nj");
		set.add("dc");
		for(String element:set){
			System.out.println(element.substring(3));
		}
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		Integer[] nums = {2,3,5,1,5};
		List<Integer> list = Arrays.asList(nums);
		int max = 0;
		for (int i=0;i < list.size(); i++){
			int element = list.get(i);
			if(element > max){
				max = element;
			}
		}
		System.out.println(max);
		for(int num: list){
			if(num > max){
				max = num;
			}
		}
		Iterator iterator2 = list.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
	}

}
