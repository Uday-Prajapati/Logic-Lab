//Q3. Even or Odd Number Counter
//
//Scenario:
//A program counts how many numbers are even and odd.
//
//Rules:
//
//Take 5 numbers from user using loop
//
//Count even numbers
//
//Count odd numbers
//
//Task:
//Display total even and odd count.
//
//Concepts Tested:
//for loop, if-else, modulo operator

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

