/**
 * 
 */
package edu.oit.lesson4.assignment.program3;

/**
 * @author JoshuaYao
 *
 */
public class Rectangle extends Shape {
	public double width, height;

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
