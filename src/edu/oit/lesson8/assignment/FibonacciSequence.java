/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
public class FibonacciSequence {
	// ArrayList<Integer> fib = new ArrayList<Integer>();
	//
	// public ArrayList FibonacciSequence(){
	// return fib;
	// }
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 1, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		while ((n1 + n2) <= 10000) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}