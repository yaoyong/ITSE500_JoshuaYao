/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class Animal {

	/**
	 * @param Animal
	 * 16. (1) Create a class with a default constructor (one that takes no 
	 * arguments) that prints a message. Create an object of this class.
	 * (2) Add an overloaded constructor to the previous exercise that takes a
	 * String argument and prints it along with your message.
	 */
	String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("This is an animal");
    }
    public Animal(String name) {
        this.setName(name);
        System.out.println("This is also an animal but it has name: "+this.getName());
    }
    public static void main(String args[]) {
        Animal animal = new Animal();
        Animal dog = new Animal("dog");
    }
}
