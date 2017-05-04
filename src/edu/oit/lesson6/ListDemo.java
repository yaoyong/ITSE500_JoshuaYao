package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1);
		linkedList.add(2);
		
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.getLast());
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("Spring");
		arrayList.add("Summer");
		arrayList.set(1, "Summer");
		arrayList.set(0, "Spring");
		System.out.println(arrayList.get(0));
		
		

	}

}
