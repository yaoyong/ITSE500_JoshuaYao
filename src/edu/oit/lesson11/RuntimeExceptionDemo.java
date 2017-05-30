/**
 * 
 */
package edu.oit.lesson11;

/**
 * @author JoshuaYao
 *
 */
public class RuntimeExceptionDemo {

	/**
	 * @param args
	 */
	public void nullpoint(){
		String s=null;  
		System.out.println(s.length());//NullPointerException 
	}
	public void arithmet(){
		int a=50/0;//ArithmeticException 
	}
	public void numberFormat(){
		String s="abc";  
		int i=Integer.parseInt(s);//NumberFormatException  
	}
	public void arrayIndex(){
		int a[]=new int[5];  
		a[10]=50; //ArrayIndexOutOfBoundsException
	}
	public static void main(String[] args) {


	}

}
