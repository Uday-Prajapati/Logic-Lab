import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// sum or arr element
		Scanner sc = new Scanner(System.in);
		// 1. Even and odd Sum
//		System.out.println("Enter array size:");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        int evenSum = 0, oddSum = 0;
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//            if (arr[i] % 2 == 0)
//                evenSum += arr[i];
//            else
//                oddSum += arr[i];
//        }
//
//        System.out.println("Even sum: " + evenSum);
//        System.out.println("Odd sum: " + oddSum);
		
//		2. Sum of elements at even indices
//		System.out.println("Enter the size");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		
//		int sum = 0;
//		
//		System.out.println("Enter elements");
//		for(int i=0; i<n; i++) {
//			arr[i] = sc.nextInt();
//			if(i % 2 == 0) {
//				sum += arr[i];
//			}
//		}
//		System.out.println("sum " + sum);
		
//		3. sum of first n element
		System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
        	arr[i] = sc.nextInt();
        }
            
        System.out.println("Enter N:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
        	sum += arr[i];
        }
        System.out.println(sum);
	}
}
