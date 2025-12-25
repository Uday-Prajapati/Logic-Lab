//Q1. ATM Withdrawal System

//Scenario:
//An ATM allows withdrawal only if balance is sufficient.

//Rules:
//Take account balance
//Take withdrawal amount
//If withdrawal amount ≤ balance → allow withdrawal
//Else → display “Insufficient Balance”

//Task:
//Write a Java program to perform ATM withdrawal.

//Concepts Tested:
//Scanner, if-else, variables, operators

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
