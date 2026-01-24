import java.util.*;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Fill the Code
        
        System.out.println("Enter the source");
        String src = sc.nextLine();
        
        System.out.println("Enter the destination");
        String dest = sc.nextLine();
        
        FlightManagementSystem fms = new FlightManagementSystem();
        ArrayList<Flight> flights = fms.viewFlightsBySourceAndDestination(src, dest);
        
        if(flights.isEmpty()) {
        	System.out.println("No flights available for the given source and destination");
        }else {
        	for(Flight f : flights) {
        		System.out.println("Flight ID : " + f.getFlightId());
                System.out.println("Source : " + f.getSource());
                System.out.println("Destination : " + f.getDestination());
                System.out.println("No of seats : " + f.getNoOfSeats());
                System.out.println("Flight Fare : " + f.getFlightFare());
        	}
        }

    }
}