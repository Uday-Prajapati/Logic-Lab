//5. Find Second Largest Number
//Topic: Arrays
//Task: Given an array, find the second largest element without sorting.
//Example Input: {10, 25, 7, 30, 15}
//Expected Output: 25

import java.util.Scanner;
public class SecondLargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Enter the element: ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i<n; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest is: " + secondLargest);
	}
}
