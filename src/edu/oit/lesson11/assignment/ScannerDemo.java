/**
 * 
 */
package edu.oit.lesson11.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @author JoshuaYao
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 * @throws NoZeroException 
	 */
	public static void main(String[] args) throws IllegalException, NoZeroException,InputMismatchException,ArithmeticException{
		int number1 = 100;
		int number2,  result;
		while(true){
			try{
				Scanner input =new Scanner(System.in);
				System.out.println("please input the number to be divided: ");
				number2 = input.nextInt();
				
				result = number1/number2;
				System.out.println(result);
//				
			}catch(InputMismatchException e){
				//System.out.println("only number");
				throw new IllegalException();
			}catch(ArithmeticException e){
				//System.out.println("The division can't be zero, please input again: ");
				//e.printStackTrace();
				throw new NoZeroException();
			}
			
		}

	}

}
