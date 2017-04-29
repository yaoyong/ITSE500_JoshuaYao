/**
 * 
 */
package edu.oit.lesson4.assignment.program3;

/**
 * @author JoshuaYao
 *
 */
public class Circle extends Shape {

	/**
	 * @param args
	 */
	public double r;

	public Circle(double r) {
		this.r = r;
	}
	public double getArea() {
		return 3.14 * r * r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
