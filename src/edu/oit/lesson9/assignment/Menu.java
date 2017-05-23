/**
 * 
 */
package edu.oit.lesson9.assignment;

/**
 * @author JoshuaYao
 *做一个订餐的程序，根据菜名显示所用的食材
 */
import java.util.ArrayList;

public class Menu {
	private String name;
	private String type;
	private ArrayList<String> materies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getMateries(ArrayList<String> materies) {
		return materies;
	}

	public void setMateries(ArrayList<String> materies) {
		this.materies = materies;
	}

	public Menu(String name) {
		this.setName(name);
	}

	public void watchMenu() {
		System.out.println("You are watch the dish: " + this.getName() + " , hope you like it.");
		System.out.println("It has the materies of " + materies + " , hope you enjoy it.");
	}

	public static void main(String[] args) {
		Menu dish = new Menu("Pickled fish soup");
		ArrayList<String> materies = new ArrayList<String>();
		materies.add("fish");
		materies.add("Sauerkraut");
		materies.add("chili");
		materies.add("toufu");
		dish.setMateries(materies);
		dish.watchMenu();

	}

}