//Q1. Employee Salary Calculation Scenario: 
//A company gives a bonus based on employee performance. 
//Rules: Input basic salary If salary > 50,000 → add 10% bonus Else → add 5% bonus 
//Task: Write a Java program to calculate and print the final salary. 
//Concepts Tested: 
//Scanner, if-else, variables, operators, type casting
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 2: Take basic salary input
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        double bonus;

        // Step 3: Apply bonus condition
        if (salary > 50000) {
            bonus = salary * 0.10;   // 10% bonus
        } else {
            bonus = salary * 0.05;   // 5% bonus
        }

        // Step 4: Calculate final salary
        double finalSalary = salary + bonus;

        // Step 5: Print result
        System.out.println("Final Salary: " + finalSalary);
    }
}
