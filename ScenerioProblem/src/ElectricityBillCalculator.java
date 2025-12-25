//Q3. Electricity Bill Calculator
//Scenario:
//Electricity charges depend on units consumed.
//
//Rules:
//First 100 units → ₹5/unit
//Next 100 units → ₹7/unit
//Above 200 units → ₹10/unit
//
//Task:
//Calculate and display total electricity bill.
//
//Concepts Tested:
//Arithmetic operators, if-else, variables

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total Electricity Bill: ₹" + bill);
    }
}

