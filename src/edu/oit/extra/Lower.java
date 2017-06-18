/**
 * 
 */
package edu.oit.extra;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author JoshuaYao
 * 19.Given a list of strings, return a list where each string is converted to lower case
 * (Note: String toLowerCase() method).

	 lower(["Hello", "Hi"]) ¡ú ["hello", "hi"]
	 lower(["AAA", "BBB", "ccc"]) ¡ú ["aaa", "bbb", "ccc"]
	 lower(["KitteN", "ChocolaTE"]) ¡ú ["kitten", "chocolate"]
 *
 */
public class Lower {

	/**
	 * @param args
	 */
	public static ArrayList<String> lower(ArrayList<String> upcase){
        Iterator it = upcase.iterator();
        ArrayList<String> lowercase = new ArrayList<String>();
        while(it.hasNext()){
            String a = (String) it.next();
            a = a.toLowerCase();
            lowercase.add(a);
        }
        return lowercase;
    }
    public static void main(String args[]) {
        ArrayList<String> listString1 = new ArrayList<String>();
        listString1.add("Hello");
        listString1.add("Hi");
        System.out.println(Lower.lower(listString1));

        ArrayList<String> listString2 = new ArrayList<String>();
        listString2.add("AAA");
        listString2.add("BBB");
        listString2.add("ccc");
        System.out.println(Lower.lower(listString2));

        ArrayList<String> listString3 = new ArrayList<String>();
        listString3.add("KitteN");
        listString3.add("ChocolaTE");
        System.out.println(Lower.lower(listString3));

    }
}