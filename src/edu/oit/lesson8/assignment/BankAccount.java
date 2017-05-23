/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
public class BankAccount { // BankAccount template for CodeStepByStep
	private String id = "";
	private String name = "";
	private double balance = 0.00;
	private boolean allowNegativeBalance = false;
	private int transactions = 0;
	private String transactionText = "";

	public BankAccount() {
	}

	public BankAccount(String id) {
		this.id = id;
		this.name = id;
	}

	public BankAccount(String id, double balance) {
		this.id = id;
		this.name = id;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public String getTransactions() {
		return transactionText;
	}

	public void deposit(double amount) {
		if (0 <= amount) {
			balance += amount;
			transactionText += "deposit of $" + amount + "\n";
		}
		transactions++;
		double fee = 5.00 * this.getTransactionCount();
		this.transactionFee(fee);
	}

	public void setAllowNegativeBalance(boolean allowNegativeBalance) {
		this.allowNegativeBalance = allowNegativeBalance;
	}

	public void setBalance(double balance) {
		if (balance >= 0 || allowNegativeBalance) {
			this.balance = balance;
		}
	}

	public void withdraw(double amount) {
		if (allowNegativeBalance || balance >= amount) {
			balance -= amount;
			transactionText += "withdrawal of $" + amount + "\n";
		}
		transactions++;
		double fee = 5.00 * this.getTransactionCount();
		this.transactionFee(fee);
	}

	public String __toString() {
		return id;
	}

	// your code here:
	public boolean transactionFee(double fee) {

		if (this.getTransactionCount() > 0 && fee < balance) {
			balance -= fee;
			this.allowNegativeBalance = true;
		}
		if (this.getTransactionCount() > 0 && fee > balance) {
			this.allowNegativeBalance = false;
		}
		return allowNegativeBalance;

	}

	public static void main(String[] args) {
		BankAccount savings = new BankAccount("Jimy");
		savings.deposit(10.00);
		savings.deposit(50.00);
		savings.deposit(10.00);
		savings.deposit(70.00);
		System.out.println(savings.balance);
	}

}