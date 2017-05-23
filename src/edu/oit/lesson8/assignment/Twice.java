/**
 * 
 */
package edu.oit.lesson8.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author JoshuaYao
 *
 */
public class Twice {

	/**
	 * @param twice
	 * Write a method named twice that accepts an ArrayList of strings as a parameter
	 * and that appends a second occurrence of the entire list to itself. 
	 * For example, if an ArrayList named list stores the values {"how", "are", "you?"}, 
	 * the call of twice(list); should modify the list to store 
	 * {"how", "are", "you?", "how", "are", "you?"}.

	 */
	public List<String> twice(List<String> list){
		//list.clone();
		//list.add(list.clone());
		List<String> newList = new ArrayList<>();
		newList.addAll(list);
		for(int i =0; i < list.size(); i++){
			String st = list.get(i);
			//Collection c = new Colliection();
			newList.add(st);
		}
		//newList.addAll(list);
		return newList;	
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("how");
		list.add("are");
		list.add("you?");
//		System.out.println(list);
		Twice myTwice = new Twice();
		System.out.println(myTwice.twice(list));

	}

}
