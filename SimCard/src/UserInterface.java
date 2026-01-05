import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        //Fill the code here
       System.out.println("Enter the phone number");
       long phoneNumber = sc.nextLong();
       
       long oddNumber = 0;
       long evenNumber = 0;
       
       while(phoneNumber > 0) {
    	   long digit = phoneNumber % 10; // calculate last digit
       
    	   if(digit%2==0) {
    		   evenNumber = evenNumber+digit;
    	   }
    	   else {
    		   oddNumber = oddNumber+digit;
    	   }
    	   
    	   phoneNumber = phoneNumber / 10; // remove last digit
       }
       
       if(oddNumber == evenNumber) {
    	   System.out.println("Sum of odd and even are equal");
       }
       else if(evenNumber > oddNumber) {
    	   System.out.println("Sum of even is greater than sum of odd");
       }
       else {
    	   System.out.println("Sum of odd is greater than sum of even");
       }
    }
}