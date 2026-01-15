import java.util.Scanner;

public class UserInterface{
	// odd
	public boolean oddDigit(int digit) {
		if(digit < 1 || digit > 9) {
			return false;
		}
		return digit % 2 !=0;
	}
	
	// even
	public boolean evenDigit(int digit) {
		if(digit < 1 || digit > 9) {
			return false;
		}
		return digit % 2==0;
	}
	
	// prime
	public boolean primeDigit(int digit) {
		if(digit < 2 || digit > 9) {
			return false;
		}
		for(int i=2; i<=digit / 2; i++) {
			if(digit % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	// composite
	public boolean compositeDigit(int digit) {
		if(digit < 4 || digit > 9) {
			return false;
		}
		
		for(int i = 2; i<=digit/2; i++) {
			if(digit % i == 0) {
				return true;
			}
		}
		return false;
		
	}
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       UserInterface ui = new UserInterface();
       
       System.out.println("Enter the total number of PIN numbers");
       int n = sc.nextInt();
       
       if(n <= 0) {
    	   System.out.println(n + " is an invalid number");
    	   return;
       }
       
       System.out.println("Enter the PIN numbers");
       int validCount = 0;
      
       for(int i=0; i<n; i++) {
    	   int pin = sc.nextInt();
    	   
    	   if(pin < 1000 || pin > 9999) {
    		   System.out.println(pin + " is an invalid PIN number");
    		   continue;
    	   }
    	   
    	   int firstDigit = pin / 1000;
    	   int secondDigit = (pin / 100) % 10;
    	   int thirdDigit = (pin / 10) % 10;
    	   int fourthDigit = pin % 10;
    	   
    	   if(ui.oddDigit(firstDigit) && 
    			   ui.evenDigit(secondDigit) && 
    			   ui.primeDigit(thirdDigit) && 
    			   ui.compositeDigit(fourthDigit)) {
    		   
    		   if(validCount == 0) {
    			   System.out.println("Valid PIN numbers are");
    		   }
    		   System.out.println(pin);
    		   validCount++;
    	   }
       }
       if(validCount == 0) {
    	   System.out.println("All these " + n + " numbers are not a valid PIN number");
       }
    }
}