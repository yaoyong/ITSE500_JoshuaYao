package edu.oit.lesson2;

import java.util.Scanner;

public class JavaInput {
	public static void main(String[] args) {
		int number1, number2, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("enter first multiple:");
		number1 = input.nextInt();
		System.out.printf("output:", number1);
	}
}
