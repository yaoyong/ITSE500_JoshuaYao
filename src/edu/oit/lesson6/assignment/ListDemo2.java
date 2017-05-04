/**
 * 
 */
package edu.oit.lesson6.assignment;

import java.util.*;

/**
 * @author JoshuaYao
 *
 */
public class ListDemo2 {

	/**
	 * @param 
	 * Write a method alternate to accept two integer List as a parameter, 
	 * return a new List, for the two elements of the list in order to alternately stitch together:
		The first element in the first list
		The first element in the second list
		The second element in the first list
		The second element in the second list
		The third element in the first list
		The third element in the second list
		...
		If the length of the two lists is not equal, then the longer list of elements 
		out of the order in order to stitch into the results.
	 */
	public List<Integer> alternate(List<Integer> l, List<Integer> n) {
		List<Integer> tempList = new ArrayList<Integer>();
		Iterator<Integer> it1 = l.iterator();
		Iterator<Integer> it2 = n.iterator();
		while (it1.hasNext() && it2.hasNext()) {
			int a = it1.next();
			int b = it2.next();
			tempList.add(a);
			tempList.add(b);
		}
		while (it1.hasNext()) {
			int a = it1.next();
			tempList.add(a);
		}
		while (it2.hasNext()) {
			int b = it2.next();
			tempList.add(b);
		}
		return tempList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> n = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		n.add(9);
		n.add(10);
		n.add(11);
		ListDemo2 myListDemo2 = new ListDemo2();
		System.out.println(myListDemo2.alternate(l, n));
	}

}
