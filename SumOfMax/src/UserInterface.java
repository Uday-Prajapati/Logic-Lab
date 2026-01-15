import java.util.Arrays;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the array size");
       int n = sc.nextInt();
       
       if(n <= 0) {
    	   System.out.println(n + " is an invalid array size");
    	   return;
       }
       
       if(n%2 != 0) {
    	   System.out.println(n + " is an odd number.Please enter even number");
    	   return;
       }
       
       int[] arr = new int[n];
       System.out.println("Enter the number");
       
       for(int i=0; i< arr.length; i++) {
    	   arr[i] = sc.nextInt();
       }        
       
       Arrays.sort(arr);
       
       int maxSum = Integer.MIN_VALUE;
       
       // n/2 for max + min
       for(int i = 0; i<n/2; i++) {
    	   
    	   // arr[i] minimum
    	   // arr[n - 1 - i] maxmum
    	   int sum = arr[i] + arr[n - 1 - i];
    	   if(sum > maxSum) {
    		   maxSum = sum;
    	   }
       }
       System.out.println("The maximum number is " + maxSum);
    }
}