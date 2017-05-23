/**
 * 
 */
package edu.oit.lesson10;

/**
 * @author JoshuaYao
 *
 */
public class Apple extends Fruit {

	/**
	 * @param args
	 */
	public Apple(){
		this.setColor("red");
	}
	public static void main(String[] args) {
		Fruit apple = new Apple();
		//apple.color = "red";
		System.out.println(apple.getColor() + " " + apple.count);
	}

}
