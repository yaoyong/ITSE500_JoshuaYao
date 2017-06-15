/**
 * 
 */
package edu.oit.extra;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author JoshuaYao
 *
 */
public class NoLong {

	/**
	 * @param NoLong
	 * Given a list of strings, return a list of the strings, 
	 * omitting any string length 4 or more.
	 * noLong(["this", "not", "too", "long"]) ¡ú ["not", "too"]
	 */
	public ArrayList<String> noLong(ArrayList<String> arrayList){
		ArrayList<String> tempArrayList  = new ArrayList();
		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			String a = it.next();
			// for(Integer a:l){
			if (a.length()<4) {
				tempArrayList.add(a);
			}
			// }
		}
		return tempArrayList;
	}
	public static void main(String[] args) {
		ArrayList<String> arrayList  = new ArrayList();
		arrayList.add("this");
		arrayList.add("not");
		arrayList.add("too");
		arrayList.add("long");
		
		NoLong noLong= new NoLong();
		System.out.println(arrayList+" ¡ú");
		System.out.println(noLong.noLong(arrayList));

	}

}
