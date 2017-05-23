/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
public class AddCommas {

	/**
	 * @param AddCommas
	 * Write a method named addCommas that accepts a string 
	 * representing a number and returns a new string with a comma 
	 * at every third position, starting from the right. 
	 * For example, the call of addCommas("12345678") 
	 * returns "12,345,678".
	 */
	public String  addCommas(String numbers){
		String result = numbers;

	    if (numbers.length() <= 3) return numbers; // If the value has 3 numbers or less which it returns that value

	    for (int i = 0; i < (numbers.length()-1) / 3; i++) {

	      int commaPut = numbers.length()-3-(3*i); // put a comma in each circle

	      result = result.substring(0, commaPut) + "," + result.substring(commaPut);
	    }
	   return result;
	}
	public static void main(String[] args) {
		AddCommas myAddCommas = new AddCommas();
		System.out.println(myAddCommas.addCommas("123456789"));
		System.out.println(myAddCommas.addCommas("12345678"));
		System.out.println(myAddCommas.addCommas("12"));

	}

}
