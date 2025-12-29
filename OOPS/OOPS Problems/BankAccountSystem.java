import java.util.*;
class BankAccount{
	// private variable 
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	// constructor
	public BankAccount(int accountNumber, String accountHolderName, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	// getter to get the data
	public int getAccNo() {
		return accountNumber;
	}
	
	public String getAccName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount deposited");
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("insufficient");
		}else{
			balance = balance - amount;
			System.out.println("Amoount withdrawed");
		}
	}
	
	public void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: : " + accountHolderName);
		System.out.println("Balance : " + balance);
	}
}
public class BankAccountSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount(101, "uday", 1000);
		
		int choice;
		
		do{
			System.out.println("---Menue---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter amount to deposit: ");
				double depositAmount = sc.nextDouble();
				ba.deposit(depositAmount);
				break;
			
			case 2:
				System.out.println("Enter amount to deposit: ");
				double withdrawAmount =  sc.nextDouble();
				ba.withdraw( withdrawAmount);
				break;
				
			case 3:
				ba.display();
				break;
			
			case 4:
				System.out.println("Exit..");
				break;
			}
			
		}while(choice != 4);
		sc.close();
	}
}
