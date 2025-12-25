//Q4. Banking PIN Validation
//
//Scenario:
//A bank system allows only 3 attempts to enter correct PIN.
//
//Rules:
//Correct PIN is 1234
//User gets max 3 attempts
//If correct → “Access Granted”
//Else → “Card Blocked”
//
//Task:
//Implement using a loop.
//
//Concepts Tested:
//while loop, break, Scanner
//

import java.util.Scanner;

public class BankingPINValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong PIN");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("Card Blocked");
        }
    }
}

