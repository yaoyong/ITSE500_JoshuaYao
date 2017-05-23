/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
public class IsMultiple {

	/**
	 * @param isMultiple
	 * Write a method named isMultiple that accepts 
	 * two non-negative int parameters a and b, 
	 * and returns true if a is a multiple of b, 
	 * and false otherwise. For example, 
	 * the call of isMultiple(15, 5) would 
	 * return true because 15 = 5 * 3. 
	 * You may assume that a and b are non-negative integers 
	 * and that b is not 0.
	 */
	boolean result;
	public boolean isMultiple(int a, int b){
		if(a>0 && b>=0){
			if(a%b==0){
				result = true;
			}else{
				result = false;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		IsMultiple myMultiple = new IsMultiple();
		System.out.println(myMultiple.isMultiple(15, 5));
		System.out.println(myMultiple.isMultiple(15, 4));

	}

}
