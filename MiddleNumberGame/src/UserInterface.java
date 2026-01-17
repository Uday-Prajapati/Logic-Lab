import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		if(n <= 0 || n > 10) {
			System.out.println("Please enter a valid number");
			return;
		}else if(n % 2 == 0) {
			System.out.println("Please enter an odd number");
			return;
		}
		
		
		if(n == 1) {
			System.out.println("Enter the elements");
			int singleElement = sc.nextInt();
			System.out.println("The sum of the values is 0");
			System.out.println("The product of the values is 0");
			return;
		}
			
		System.out.println("Enter the elements");
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] <= 0 || arr[i] > 10) {
				System.out.println("Please enter valid elements in the array");
				return;
			}
		}
		
		int sum = 0;
		int product = 1;
		int mid = n / 2;
		
		if(arr[mid] % 2 == 0) {
			// ADD elements Above middle
			for(int i=0; i< mid; i++) {
				sum += arr[i];
			}
			
			// MULTIPLY elements Below middle
			for(int i = mid + 1; i<n; i++) {
				product *= arr[i];
			}
		}else {
			// MULTIPLY elements ABOVE middle
			for(int i = 0; i<mid; i++) {
				product *= arr[i];
			}
			
			 // ADD elements BELOW middle
			for(int i=mid+1; i< n; i++) {
				sum += arr[i];
			}
		}
		System.out.println("The sum of the values is " + sum);
		System.out.println("The product of the values is " + product);
	}
}
