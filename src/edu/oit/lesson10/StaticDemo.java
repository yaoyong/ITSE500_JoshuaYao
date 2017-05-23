/**
 * 
 */
package edu.oit.lesson10;

/**
 * @author JoshuaYao
 *
 */
public class StaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit apple = new Fruit();
		apple.setColor("red");
		Fruit balana = new Fruit();
		balana.setColor("yellow");
		Fruit.print();
		apple.printColor();
		balana.printColor();
	}

}
