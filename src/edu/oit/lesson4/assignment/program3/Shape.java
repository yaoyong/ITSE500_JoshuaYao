/**
 * 
 */
package edu.oit.lesson4.assignment.program3;
/**
 * @author JoshuaYao
 *
 */
abstract class Shape {
	abstract double getArea();
	public static void main(String[] args){
		Shape rectangle = new Rectangle(4, 5);
		Shape circle = new Circle(5);
		Shape triangle = new Triangle(4, 6);
		System.out.println("Rectangle's area is: " + rectangle.getArea() + ", good job!");
		System.out.println("Circle's area is: " + circle.getArea() + ", well done!");
		System.out.println("Triangle's area is: " + triangle.getArea() + ", fantastic!");
		
	}
}