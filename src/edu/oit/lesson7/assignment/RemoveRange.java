/**
 * Write a method called removeRange that accepts three parameters: 
 * a Set of integers, a minimum value, and a maximum value. 
 * The method should remove any values from the set that are between that 
 * minimum and maximum value, inclusive. For example, if a Set named s 
 * contains [3, 17, -1, 4, 9, 2, 14], the call of removeRange(s, 1, 10); 
 * should modify s to store [17, -1, 14].
 */
package edu.oit.lesson7.assignment;

import java.util.*;

/**
 * @author JoshuaYao
 *
 */
public class RemoveRange {
	public List<Integer> removeRange(List<Integer> s, int min, int max) {
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			int i = it.next();
			if (min < i && i < max) {
				it.remove();
			}
		}
		// System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(3);
		s.add(17);
		s.add(-1);
		s.add(4);
		s.add(9);
		s.add(2);
		s.add(14);
		// System.out.println(s);
		RemoveRange myRemoveRange = new RemoveRange();
//		int min = 1;
//		int max = 10;
		System.out.println(myRemoveRange.removeRange(s, 1, 10));

	}

}