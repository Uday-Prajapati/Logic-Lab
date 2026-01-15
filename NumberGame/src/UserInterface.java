import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
        //Fill the code here
       System.out.println("Enter the number of chances");
       int chance = sc.nextInt();
       // in range
       if(chance < 1 || chance > 5 ) {
    	   System.out.println("Your chance " + chance + " is out of range(1-5)");
    	   return;
       }
       
       int[] num = new int[chance * 2];
       int sum = 0;
       
       System.out.println("Enter the numbers");
       for(int i=0; i<num.length;i++) {
    	   num[i] = sc.nextInt(); 
    	   
    	   if(num[i] <= 0 || num[i] >= 10) {
    		   System.out.println(num[i] + " is an invalid number");
    		   return;
    	   }
    	   
    	   sum+=num[i];
       }
       
       int count = 0;
       for(int i=1; i<= sum; i++) {
    	   if(sum % i == 0) {
    		   count++;
    	   }
       }
       if(count == 2) {
    	   System.out.println("The sum " + sum + " is a prime number.You won the game");
       }else {
    	   System.out.println("The sum " + sum + " is not a prime number.Better luck next time");
       }
    }
}