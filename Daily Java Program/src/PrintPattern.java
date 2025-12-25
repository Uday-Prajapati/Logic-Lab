//3. Print Pattern (Loops)
//
//Topic: Loops
//Task: Print the following pattern for n=4:
//
//*
//* *
//* * *
//* * * *

import java.util.Scanner;
public class PrintPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
