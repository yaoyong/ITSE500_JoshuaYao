/**
 * 
 */
package edu.oit.lesson4.assignment.program3;

/**
 * @author JoshuaYao
 *
 */
public class Triangle extends Shape{

	public double base, height;

	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	public double getArea() {
		return base * height/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
