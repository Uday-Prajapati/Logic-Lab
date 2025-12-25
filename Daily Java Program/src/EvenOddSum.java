//7. Sum of Even and Odd Numbers Separately
//
//Topic: Loops & Control Flow
//Task: Read n numbers and print sum of even numbers and sum of odd numbers separately.
//Example Input: 5 numbers: 2 3 4 5 6
//Expected Output:
//Sum of Even = 12
//Sum of Odd = 8

import java.util.Scanner;
public class EvenOddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		System.out.print("Enter " + n + " number: ");
		for(int i=0; i<n; i++) {
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				evenSum += number;
			}else {
				oddSum += number;
			}
		}
		System.out.println("Sum of Even: " + evenSum);
		System.out.print("Sum of Odd: " + oddSum);
	}
}
