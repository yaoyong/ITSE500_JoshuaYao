package edu.oit.lesson1;

public class Product {
	public static void product() {
		int a = 1;
		int b = 1;
		int c = 1;
		for (a = 1; a < 10; a++) {
			for (b = 1; b < 10; b++) {
				c = a * b;
				System.out.println(c);
			}

		}
	}

	public static void main(String[] args) {
		Product.product();

	}

}
