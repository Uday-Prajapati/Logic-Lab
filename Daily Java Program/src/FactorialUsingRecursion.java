//9. Factorial Using Recursion
//
//Topic: Methods
//Task: Write a recursive method factorial(int n) and print factorial of a given number.
//Example Input: 5
//Expected Output: 120

import java.util.Scanner;
public class FactorialUsingRecursion {
	
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int result = factorial(num);
		System.out.println(result);
	}
}
