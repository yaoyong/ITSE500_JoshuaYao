/**
 * Simulating the system of zoo
 */
package edu.oit.lesson4.assignment.program1;

import java.util.Scanner;

/**
 * @author JoshuaYao
 *This is the first program of the fourth assignment.
 */
public class Zoo {

	/**
	 * @param args
	 */
	private String name;
	private String address;
	private double size;
	private double price;
	private String owner = "Joshua Yao";
	public Zoo(){
		
	}
	public void sellTicket(double price){
		this.price = price;
		System.out.println("This is the entrance of buying a ticket: The price is: " + price );
		Scanner scanner = new Scanner(System.in);
		// prompt the user
		System.out.println("Getting to know about this zoo? "
				+ "yes or no? Please input your answer:");
		// Use the Scanner to read a line of text from the user.
		String input = scanner.nextLine();
		if (input.equals("yes")){
			introduce();
			System.out.println("You can go to watch animals now, please enjoy yourself ~");
		}else{
			System.out.println("You can go to watch animals now, please enjoy yourself ~");
		}
			
	}
	public void introduce(){
		System.out.println("This is the most beautiful and interesting Zoo,"
				+ "You will have much fun here, it was created by" + this.owner + ", remember him, he let you have fun here...Thanks for listenting " );
	}
	public void watchAnimal(){
		System.out.println("There are all kinds of animal you can watch");
	}
	public void feedAnimal(){
		System.out.println("We are the feeder team, we are ready to feed animals");
	}
	public void closeDoor(){
		System.out.println("Thanks for your coming, it is the time for animal to have a rest, we need to close.");
	}
	public void timer(){
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		zoo.sellTicket(5);
		zoo.timer();
		zoo.watchAnimal();
		zoo.timer();
		zoo.feedAnimal();
		zoo.timer();
		zoo.closeDoor();
		

	}

}
