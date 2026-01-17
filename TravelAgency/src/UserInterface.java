import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
       System.out.println("Enter the city name");
       String city = sc.nextLine();
       
       String[] cityName = {"Chennai", 
    		   "Coimbatore", 
    		   "Erode", 
    		   "Karur", 
    		   "Madurai", 
    		   "Hyderabad", 
    		   "Salem", 
    		   "Bangalore", 
    		   "Delhi", 
    		   "Agra"};
       
       // searching
       boolean found = false;
       
       for(int i = 0; i<cityName.length; i++) {
    	   if(city.equalsIgnoreCase(cityName[i])) {
    		   found = true;
    		   break;
    	   }
       }
       
       if(found == true) {
    	   System.out.println("Bus for " + city +  " is available");
    	   return;
       }  
       
	   if(found == false){
    	   System.out.println("Bus for " + city +  " is not available");
    	   return;
       }
    }
}