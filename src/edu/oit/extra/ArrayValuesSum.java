/**
 * 
 */
package edu.oit.extra;

import java.lang.reflect.Array;

/**
 * @author JoshuaYao
 *
 */
public class ArrayValuesSum {

	/**
	 * @param args
	 * 13.Write a Java program to sum values of an array.
	 */
	public static void main(String[] args) {
		 int[] s ;  
         int i ;  
         int sum =0;
         s = new int[5] ;  
         for(i = 0 ; i < 5 ; i++) {  
             s[i] = i ;  
         }  
         for(i = 4 ; i >= 0 ; i--) { 
        	 
        	 sum = sum+s[i];
               
         }     
         System.out.println(sum);
	}
}
