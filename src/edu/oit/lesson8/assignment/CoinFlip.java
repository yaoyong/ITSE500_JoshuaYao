/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class CoinFlip {
	ArrayList<Boolean> list = new ArrayList<Boolean>();

	public void coinFlip(int k, char coinside) {
		boolean flag;
		if (coinside == 'H') {
			flag = true;
		} else {
			flag = false;
		}
		Random randomno = new Random();
		int count = 0;
		while (true) {
			boolean value = randomno.nextBoolean();
			list.add(value);
			if (list.size() > k) {
				int a = list.size() - k;
				int b = list.size();
				for (int i = a; i < b; i++) {
					if (list.get(i) == flag) {
						count++;
					}
				}
			}
			if (count < k)
				count = 0;
			if (count == k)
				break;
		}
		Iterator it = list.iterator();
		ArrayList listtemp = new ArrayList<String>();
		// String temp;
		while (it.hasNext()) {
			boolean temp = (boolean) it.next();
			if (temp == true)
				listtemp.add("H");
			else
				listtemp.add("T");

		}
		System.out.println(listtemp);
		System.out.println("You got " + coinside + " " + k + "  times in a row!");

	}

	public static void main(String[] args) {
		CoinFlip myCoinFlip = new CoinFlip();
		myCoinFlip.coinFlip(4, 'T');

	}

}