/**
 * 
 */
package edu.oit.lesson4.assignment.program2;

import javax.management.loading.PrivateClassLoader;

/**
 * @author JoshuaYao
 *
 */
public class Fruit {

	/**
	 * @param args
	 */
	private String name;
	private int treeAge;
	private boolean seedless;
	private int number;
	public Fruit(){
		
	}
	public Fruit(String name){
		this.name = name;
	}
	public void plant(){
		System.out.println("Plant a new" + name + "tree");
	}
	public void grow(){
		System.out.println("I am a " + name + "tree, I am growing well");
	}
	public int harvest(int number){
		this.number = number;
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
