/**
 * 
 */
package edu.oit.lesson4.assignment.program3;
/**
 * @author JoshuaYao
 *
 */
abstract class Shape {
	abstract double area();
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle(4, 5);
		Circle circle = new Circle(5);
		Triangle triangle = new Triangle(4, 6);
		System.out.println("Rectangle's area is: " + rectangle.area() + ", good job!");
		System.out.println("Circle's area is: " + circle.area() + ", well done!");
		System.out.println("Triangle's area is: " + triangle.area() + ", fantastic!");
		
	}
}