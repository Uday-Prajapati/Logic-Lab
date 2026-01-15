import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
    //Fill the code here
	
	// array 1
    System.out.println("Enter the size of first array");
    int n1 = sc.nextInt();
    if(n1<=0) {
    	System.out.println(n1 + " is an invalid array size");
    	return;
    }
    
    int [] arr1 = new int[n1];
    System.out.println("Enter the array elements");
    for(int i=0;i<arr1.length; i++) {
    	arr1[i] = sc.nextInt();
    	if(arr1[i] <0) {
    		System.out.println(arr1[i] + " is an invalid input");
    		return;
    	}
    }
    
    // array 2
    System.out.println("Enter the size of second array");
    int n2 = sc.nextInt();
    if(n2<=0) {
    	System.out.println(n2 + " is an invalid array size");
    	return;	
    }
    else if(n1 != n2) {
    	System.out.println("Both array size is different");
    	return;
    }
    int [] arr2 = new int[n2];
    System.out.println("Enter the array elements");
    for(int i=0;i<arr2.length; i++) {
    	arr2[i] = sc.nextInt();
    	if(arr2[i] <0) {
    		System.out.println(arr2[i] + " is an invalid input");
    		return;
    	}
    }
    
    // array 3
    int[] arr3 = new int[n1];
    for(int i = 0; i<n1; i++) {
    	arr3[i] = arr1[i] + arr2[i]; // arr1 + arr 2
    }
    
    // sum 
    int sumLastDigit = 0;
    for(int i=0; i<n1; i++) {
		 sumLastDigit += arr3[i] % 10; // read each digit
    }
    
    // prime
    int count = 0;
    for(int i = 1; i<=sumLastDigit; i++) {
    	if(sumLastDigit % i == 0) {
    		count++;
    	}
    }
    if(count == 2) {
    	System.out.println(sumLastDigit + " is a prime number");
    }else {
    	System.out.println(sumLastDigit + " is not a prime number");
    }
    
    }
}
