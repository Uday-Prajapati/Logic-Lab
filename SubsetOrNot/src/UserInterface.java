import java.util.Arrays;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first array size");
       int n1 = sc.nextInt();
       if(n1 <= 0) {
    	   System.out.println(n1+" is an invalid array size");
    	   return;
       }
       // arrr 1
       int[] arr1 = new int[n1];
       System.out.println("Enter the numbers");
       for(int i=0; i<n1; i++) {
    	   arr1[i] = sc.nextInt();
       }
       
       // arr 2
       System.out.println("Enter the second array size");
       int n2 = sc.nextInt();
       if(n2 <= 0) {
    	   System.out.println(n2 + " is an invalid array size");
    	   return;
       }
       else if(n2 > n1) {
    	   System.out.println(n2 + " is an invalid size as it is greater than first array size " + n1);
    	   return;
       }
       
       int[] arr2 = new int[n2];
       System.out.println("Enter the numbers");
       for(int i=0; i<n2; i++) {
    	   arr2[i] = sc.nextInt();
       }
       
       boolean isSubset = true;
       
       for(int i = 0; i<n2; i++) {
    	   boolean found = false;
    	   
    	   for(int j = 0; j<n1; j++) {
        	   if(arr2[i] == arr1[j]) {
        		   found = true;
        		   break;
        	   }
           }
    	   
    	   if(!found) {
    		   isSubset = false;
    		   break;
    	   }
       }
       if(isSubset) {
    	   System.out.println("Array2 of size " + n2 + " is a subset of array1");
       }else {
    	   System.out.println("Array2 of size " + n2 + " is not a subset of array1");
       }
    }
}