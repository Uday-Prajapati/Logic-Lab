import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
       // array 1
       System.out.println("Enter the size for the first array");
       int n1 = sc.nextInt();
       if(n1 <= 0) {
    	   System.out.println(n1 + " is an invalid array size");
    	   return;
       }
       
       System.out.println("Enter the elements for the first array");
       int[] arr1 = new int[n1];
       for(int i=0; i<arr1.length; i++) {
    	   arr1[i] = sc.nextInt();
       }
       
    // array 2
       System.out.println("Enter the size for the second array");
       int n2 = sc.nextInt();
       if(n2 <= 0) {
    	   System.out.println(n2 + " is an invalid array size");
    	   return;
       }
       
       System.out.println("Enter the elements for the second array");
       int[] arr2 = new int[n2];
       for(int i=0; i<arr2.length; i++) {
    	   arr2[i] = sc.nextInt();
       }
       
       if(n1 != n2) {
    	   System.out.println("Both array size are not the same");
    	   return;
       }
       
       // array 3
       int[] arr3 = new int[n1];
       System.out.println("The elements of the third array");
       for(int i = 0; i<n1; i++) {
    	   if(i % 2 == 0) {
    		   arr3[i] = arr1[i] + arr2[i];
    	   }else {
    		   arr3[i] = arr1[i] - arr2[i];
    	   }
    	   System.out.println(arr3[i]);
       }
       
    }
}