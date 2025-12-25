//10. Simple ATM Simulation
//
//Topic: Control Flow & Loops
//Task: Simulate an ATM with options:
//
//Check Balance
//Deposit
//Withdraw
//Exit
//Start with balance = 1000.
//Example Interaction:
//Choice: 2
//Enter amount: 500
//New Balance: 1500

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000;  // starting balance
        int choice;
        int amount;
        
        while(true) { // ensure menu display after every operation
        	System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();  // user input for menu choice
            
            // checking balance
            if(choice == 1) {
            	System.out.println("Balance: " + balance);
            }
            
            // depsoit amount
            else if(choice == 2) {
            	
            	System.out.println("Enter amount to deposit: ");
            	double deposit = sc.nextDouble();
            	balance = balance + deposit;
            	System.out.println("Deposit Amount: "+ deposit + ", New Balance: " + balance );
            }
            
            // withdraw amount
            else if(choice == 3) {
            	
            	System.out.println("Enter amount to withdraw: ");
            	double withdraw = sc.nextDouble();
            	balance = balance - withdraw;
            	System.out.println("Withdraw Amount: "+ withdraw + ", New Balance: " + balance );
            }
            else if(choice == 4) {
            	System.out.println("Exit.....");
            }
            else {
            	System.out.println("Invalid Choice");
            }
        }
    }
}

