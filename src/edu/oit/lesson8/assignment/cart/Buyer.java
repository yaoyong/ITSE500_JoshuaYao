/**
 * 
 */
package edu.oit.lesson8.assignment.cart;

/**
 * @author JoshuaYao
 *
 */
public class Buyer {
	private String name;
	private String gender;
	private Cart cart;
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
			
	
}
