//Q4. Employee Tax Calculator
//
//Scenario:
//Tax is calculated based on annual salary.
//
//Rules:
//
//Salary ≤ 3,00,000 → No tax
//
//Salary ≤ 6,00,000 → 10% tax
//
//Salary > 6,00,000 → 20% tax
//
//Task:
//Calculate and print tax amount.
//
//Concepts Tested:
//if-else ladder, arithmetic operations

import java.util.Scanner;

public class EmployeeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();

        double tax;

        if (salary <= 300000) {
            tax = 0;
        } else if (salary <= 600000) {
            tax = salary * 0.10;
        } else {
            tax = salary * 0.20;
        }

        System.out.println("Tax Amount: " + tax);
    }
}

