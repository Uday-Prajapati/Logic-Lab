import java.util.*;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the code here
        System.out.println("Enter the flight id");
        int id = sc.nextInt();
        
        FlightManagementSystem fms = new FlightManagementSystem();
        
        boolean result = fms.deleteFlight(id);
        
        if(result) {
        	System.out.println("Flight details deleted successfully");
        }else {
        	System.out.println("Flight not deleted. Check for the ID");
        }
    }
    
}