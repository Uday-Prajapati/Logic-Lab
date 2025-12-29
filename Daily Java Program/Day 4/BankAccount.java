//6) BankAccount with Access Control
//Question:
//Implement a BankAccount with validation and access control.
//Requirements:
//
//Private fields: String owner, double balance
//Methods:
//
//void deposit(double amount) — only positive amounts
//void withdraw(double amount) — must not exceed balance
//String getOwner(), double getBalance()
//
//
//Bonus: Add protected void applyFee(double fee) to simulate internal fees (for a future subclass).
//
//Usage Example:
//BankAccount acc = new BankAccount("Sarthak", 1000.0);
//acc.deposit(500);acc.withdraw(300);
//System.out.println(acc.getBalance()); // 1200.0

import java.util.Scanner;
public class BankAccount {
	
	private String owner;
	private double balance;
	
	// constructor
	public BankAccount(String owner, double amount) {
		this.owner = owner;
		this.balance = amount;
	}

	// deposit method
	public void deposit(double amount) {
		if(amount > 0) {
			balance = balance += amount;
		}
	}
	
	// wotdraw method
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
		}
	}
	
	// getter
	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// protected field
	protected void applyFee(double fee) {
		balance -= fee;
	}

	public static void main(String[] args) {
//		BankAccount acc = new BankAccount("uday", 1000.0);
//		acc.deposit(500);
//		acc.withdraw(300);
//		System.out.println(acc.getBalance());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String owner = sc.nextLine();
		
		System.out.println("Enter current balance: ");
		double balance = sc.nextDouble();
		
		// object
		BankAccount acc = new BankAccount(owner, balance);
		
		System.out.println("Enter deposit: ");
		double depositAmount = sc.nextDouble();
		acc.deposit(depositAmount);
		
		System.out.println("Enter withdraw: ");
		double withdrawAmount = sc.nextDouble();
		acc.withdraw(withdrawAmount);
		
		System.out.println(acc.getBalance());
	}

}
