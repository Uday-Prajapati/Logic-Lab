import java.util.Scanner;

public class MiniATMSimulator {

    // variables
    private static double balance = 1000.00;
    private int pin = 1234;

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.printf("Deposited: %.2f | Balance: %.2f%n", amount, balance);
        }
    }

    // Withdraw method (PIN already verified in main)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: %.2f | Balance: %.2f%n", amount, balance);
        }
    }

    // Change PIN method (old PIN already verified in main)
    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully");
    }

    // Print balance
    public void printBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniATMSimulator atm = new MiniATMSimulator();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                atm.deposit(amount);
            } 

            else if (choice == 2) {
                // PIN verify first
                System.out.print("Enter PIN: ");
                int enteredPin = sc.nextInt();

                if (enteredPin != atm.pin) {
                    System.out.println("Wrong PIN");
                } else {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    atm.withdraw(amount);
                }
            } 

            else if (choice == 3) {
                atm.printBalance();
            } 

            else if (choice == 4) {
                // PIN verify first
                System.out.print("Enter old PIN: ");
                int oldPin = sc.nextInt();

                if (oldPin != atm.pin) {
                    System.out.println("Wrong old PIN");
                } else {
                    System.out.print("Enter new PIN: ");
                    int newPin = sc.nextInt();
                    atm.changePin(newPin);
                }
            } 

            else if (choice == 5) {
                System.out.println("Thank you. Exiting...");
                break;
            } 

            else {
                System.out.println("Invalid choice, try again.");
                continue;
            }
        }
    }
}
