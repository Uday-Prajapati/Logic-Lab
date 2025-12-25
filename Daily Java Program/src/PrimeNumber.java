//3.Find if given Integer is a prime Number or not
//	Task: Given an integer element print if given integer is an prime number or not
//	Example Input: 17
//	Expected Output: 17 is an Prime number

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + " is an Prime number");
		}else {
			System.out.println(num + " is not an Prime number");
		}
	}
}
