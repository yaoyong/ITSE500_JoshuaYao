/**
 * 
 */
package edu.oit.lesson6.assignment;

import java.util.*;

/**
 * @author JoshuaYao
 *
 */
public class ListDemo1 {

	/**
	 * @param Write
	 *            a method named numUniqueValues that accepts a List of integers
	 *            as a parameter and returns the number of unique integer values
	 *            in the list. For example, if a list named l contains the
	 *            values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], the call of
	 *            numUniqueValues(l) should return 5. If passed the empty list,
	 *            you should return 0. Use a Set as auxiliary storage to help
	 *            you solve this problem. Do not modify the list passed in.
	 */

	public int numUniqueValues(List<Integer> l) {

		List<Integer> tempList = new ArrayList<Integer>();
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			int a = it.next();
			// for(Integer a:l){
			if (!tempList.contains(a)) {
				tempList.add(a);
			}
			// }
		}
		l = tempList;
		return l.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDemo1 myDataDemo = new ListDemo1();
		List<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(7);
		l.add(3);
		l.add(-1);
		l.add(2);
		l.add(3);
		l.add(7);
		l.add(2);
		l.add(15);
		l.add(15);
		// l = new ArrayList<Integer>(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
		System.out.println(myDataDemo.numUniqueValues(l));

	}

}
