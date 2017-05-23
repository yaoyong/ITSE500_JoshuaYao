/**
 * 
 */
package edu.oit.lesson10;

/**
 * @author JoshuaYao
 *
 */
public class Fruit {

	/**
	 * @param args
	 */
	public static int count;
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruit(){
		count++;
	}
	public static void print(){
		System.out.println(Fruit.count);
	}
	public void printColor(){
		System.out.println("my color is" + this.color);
	}
}
