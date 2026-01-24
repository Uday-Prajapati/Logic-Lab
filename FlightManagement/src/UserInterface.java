import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        //Fill the Code
        System.out.println("Enter flight id");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter source");
        String src = sc.nextLine();
        
        System.out.println("Enter destination");
        String dest = sc.nextLine();
        
        System.out.println("Enter noOfSeats");
        int seat = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the fare");
        double fare = sc.nextDouble();
        
        // flight object
        Flight flight = new Flight(id, src, dest, seat, fare);
        
        // FlightManagementObject
        FlightManagementSystem fms = new FlightManagementSystem();
        
        // call the method
        boolean result = fms.addFlight(flight);
        
        // print result
        if(result) {
        	System.out.println("Flight details added successfully");
        }else {
        	System.out.println("Flight details not added successfully");
        }
    }
}