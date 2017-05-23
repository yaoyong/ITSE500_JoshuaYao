/**
 * 
 */
package edu.oit.lesson8.assignment;

import java.util.*;
import java.util.ArrayList;

/**
 * @author JoshuaYao
 *
 */
public class SwitchPairs {

	/**
	 * @param switchPairs
	 * Write a method named switchPairs that accepts an ArrayList of strings 
	 * as a parameter and switches the order of pairs of values in the array. 
	 * Your method should swap the order of the first two values, then switch 
	 * the order of the next two, and so on. For example, 
	 * if the array stores {"a", "bb", "c", "ddd", "ee", "f", "g"}, 
	 * then the call of switchPairs(a); should switch the first pair ("a", "bb"), 
	 * the second pair ("c", "ddd") and the third pair ("ee", "f"), 
	 * to yield this list: {"bb", "a", "ddd", "c", "ee", "f", "g"}If there are 
	 * an odd number of values, the final element is not moved. 
	 * You may assume that the list is not null and that 
	 * no element of the array is null.
	 */
	public List<String> switchPairs(List<String> list){
		for(int i=0;i+1<list.size();i+=2){
			Collections.swap(list, i, i+1);
		}
		return list;
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("bb");
		list.add("c");
		list.add("ddd");
		list.add("ee");
		list.add("f");
		list.add("g");
		SwitchPairs mySwitchPairs= new SwitchPairs();
		System.out.println(mySwitchPairs.switchPairs(list));
	}

}
