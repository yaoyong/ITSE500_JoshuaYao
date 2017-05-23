/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
public class IsVowel {

	/**
	 * @param isVowel
	 * Write a method named isVowel that returns whether a string is a vowel 
	 * (a single-letter string containing 
	 * a, e, i, o, or u, case-insensitively).
	 */
	public String isVowel(String c){
		String result;
		if ("AEIOUaeiou".indexOf(c) != -1){
			result = "The string  "+ c +"  is a vowel.!";
		}else{
			result = "The string  "+ c +"  is not a vowel.!";
		}
		return result;
	}
	public static void main(String[] args) {
		IsVowel myVowel = new IsVowel();
		System.out.println(myVowel.isVowel("a"));

	}

}
