/**
 * 
 */
package edu.oit.lesson8.assignment.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JoshuaYao
 *taobao program
 */
public class Cart {

	/**
	 * @param args
	 */
	private int count;
	private double tatal;
	private List<Product> list;
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getTatal() {
		return tatal;
	}

	public void setTatal(double tatal) {
		this.tatal = tatal;
	}
	List<Product> temple = new ArrayList();
	public void addProduct(Product product){
		
		if (product.getCount() > 0){
			this.setCount(this.getCount()+1);
			double m = this.getTatal();
			m+=product.getPrice();
			this.setTatal(m);

			temple.add(product);
			this.setList(temple);
		}
	}
	public static void main(String[] args) {
		
		Product product = new Product("basketball", "nike", "ball", 20, 40.5);
		Product product2 = new Product("football", "addidas", "ball", 30, 20.5);
		Seller seller = new Seller();
		seller.addToSale(product);
		seller.addToSale(product2);
		Buyer buyer = new Buyer();
		Cart cart = new Cart();
		buyer.setCart(cart);
		cart.addProduct(product);
		cart.addProduct(product2);
		System.out.println("there are " + cart.getCount() + " products, "
				+ "in your cart, and the total price is " + cart.tatal + ", and they are: " );
		for(int i =0;i<cart.getCount(); i++){
			System.out.println(cart.getList().get(i).getName() + " ");
		}
	}

}
