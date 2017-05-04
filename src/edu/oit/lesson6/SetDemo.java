package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		ArrayList list1;
		LinkedList list2;
		set.add("Panda");
		set.add("Monkey");
		set.add(1);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains("Monkey"));
		System.out.println(set.size());
		System.out.println(set.remove("Panda"));
		System.out.println(set.size());
		//set.clear();
		set.clone();
		System.out.println(set.size());

	}

}
