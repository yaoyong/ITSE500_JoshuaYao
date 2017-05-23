/**
 * 
 */
package edu.oit.lesson8.assignment.cart;

/**
 * @author JoshuaYao
 *
 */
public class Product {
	private String name;
	private String brand;
	private String type;
	private int count;
	private double price;
	
	public Product(String name, String brand, String type, int count, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.count = count;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
