/**
 * 
 */
package edu.oit.lesson4;

/**
 * @author JoshuaYao
 *
 */
public class Puppy {

	/**
	 * @param args
	 */
	public String name;
	public int age;
	public Puppy(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Puppy(){
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy puppy = new Puppy("Wangwang",18);
		
		System.out.println(puppy.name + " " + puppy.age);
		

	}

}
