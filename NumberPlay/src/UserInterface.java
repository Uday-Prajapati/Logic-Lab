import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        // validation 2 digit integer
        if(num < 10 || num > 99) {
			System.out.println("invalid number");
		}else {
			
			// extract the digit
	        int tens = num / 10;
	        int units = num % 10;
	        
	        if(num > 50) {
	        	System.out.println(tens - units); // 5-6 = 1
	        }else {
	        	// number lee then equal to 50 revere 43 - 84. = 8-4 = 4
	        	int reverse = units * 10 + tens;
	        	int revTens = reverse / 10;
	        	int revUnits = reverse % 10;
	        	
	        	System.out.println(revTens - revUnits);
	        }
		}
    }
}