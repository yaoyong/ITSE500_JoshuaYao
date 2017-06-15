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
public class Copies3 {
	/**
	 * @param Copies3
	 * Given a list of strings, return a list where each string is replaced 
	 * by 3 copies of the string concatenated together.
	 * copies3(["a", "bb", "ccc"]) ¡ú ["aaa", "bbbbbb", "ccccccccc"]
	 * copies3(["24", "a", ""]) ¡ú ["242424", "aaa", ""]
	 */

	public ArrayList<String> copies3(ArrayList<String> arrayList1){
		ArrayList<String> tempArrayList  = new ArrayList();
		Iterator<String> it = arrayList1.iterator();
		try{while (it.hasNext()) {
			String a = it.next();
			String b = a+a+a;
			// for(Integer a:l){
				tempArrayList.add(b);
		}
		} finally{}
		return tempArrayList;
	}
	public static void main(String[] args) {
		ArrayList<String> arrayList  = new ArrayList();
		arrayList.add("a");
		arrayList.add("bb");
		arrayList.add("ccc");
		
		Copies3 copies3= new Copies3();
		System.out.println(arrayList+" ¡ú");
		System.out.println(copies3.copies3(arrayList));

	}

}
