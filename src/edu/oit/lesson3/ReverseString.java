/**
 * 
 */
package edu.oit.lesson3;

import java.io.*;
import java.util.Scanner;

/**
 * @author JoshuaYao
 *
 */
/*
 * Exercise ReverseString: Write a program called ReverseString, which prompts
 * user for a String, and prints the reverse of the String. The output shall
 * look like: Enter a String: abcdef The reverse of the String "abcdef" is
 * "fedcba". Follow the java coding style. Write unit test for it. Push your
 * code to github.
 */
public class ReverseString {

	public static String reverseString() {
		// Create a Scanner using the InputStream available.
		Scanner scanner = new Scanner(System.in);
		// prompt the user
		System.out.println("enter your text:");
		// Use the Scanner to read a line of text from the user.
		String input = scanner.nextLine();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char item = input.charAt(i);
			output += String.valueOf(item);
		}
		System.out.println("This is the reversed output of your input = " + output);
		return output;
	}

	public static void main(String[] args) {
		ReverseString.reverseString();
	}

}
