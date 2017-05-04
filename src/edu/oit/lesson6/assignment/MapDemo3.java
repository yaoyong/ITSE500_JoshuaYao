/**
 * 
 */
package edu.oit.lesson6.assignment;

import java.util.*;

/**
 * @author JoshuaYao
 *
 */
public class MapDemo3 {

	/**
	 * @param 
	 * Write a method leastCommon to accept a Map type of parameters, 
	 * keys are string type, values are Integer type. 
	 * Find the value of the value of the least number of occurrences in this map. 
	 * For example: a Map m contains these 
	 * elements {Alyssa = 22, Char = 25, Dan = 25, Jeff = 20, Kasey = 20, 
	 * Kim = 20, Mogran = 25, Ryan = 25, Stef = 22}, 
	 * calling leastCommon (m ) Should return 22.
	 */
	int s; // this value will be return by the following method.
	public int leastCommon(HashMap m) {
		// Accepting m's values as keys, and the counts of m's one type value as
		// its value.
		HashMap tempMap = new HashMap();
		// initialize the first time of a HashMap m's value of one key
		int count = 1;
		Iterator<Integer> it = m.values().iterator();
		while (it.hasNext()) {
			int a = it.next();
			if (!tempMap.containsKey(a)) {
				// m's one type value not in tempMap's key, its value of key "a"
				// as 1
				tempMap.put(a, count);
			} else {
				// if m's one type value already in tempMap's key, change its
				// value to add 1
				tempMap.put(a, (int) tempMap.get(a) + 1);
			}
		}
		// System.out.println(tempMap.values());
		Collection<Integer> c = tempMap.values();
		Object[] obj = c.toArray();
		Arrays.sort(obj);
		//int d = (int) obj[obj.length - 1];
		Set set = tempMap.entrySet();// 新建一个不可重复的集合
		ArrayList arr = new ArrayList<>();// 新建一个集合
		Iterator it3 = set.iterator();// 遍历的类
		while (it3.hasNext()) {
			Map.Entry entry = (Map.Entry) it3.next();// 找到所有key-value对集合
			if (entry.getValue().equals(obj[0])) {// 通过判断是否有该value值
				s = (int) entry.getKey();// 取得key值
			}
			// if(entry.getValue().equals(obj[obj.length-1])) {//通过判断是否有该value值
			// s = (int)entry.getKey();//取得key值
			//
			// }
		}

		return s;
	}

	public static void main(String[] args) {
		
		MapDemo3 myMapDemo3 = new MapDemo3();
		HashMap m = new HashMap();

		m.put("Alyssa", 22);
		m.put("Char", 25);
		m.put("Dan", 25);
		m.put("Jeff", 20);
		m.put("Kasey", 20);
		m.put("Kim", 20);
		m.put("Mogran", 25);
		m.put("Ryan", 25);
		m.put("Stef", 22);
		// System.out.println(m.values());
		System.out.println(myMapDemo3.leastCommon(m));

	}

}
