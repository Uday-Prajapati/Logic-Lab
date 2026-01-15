import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        // Fill the code
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter movie name");
		String name = sc.nextLine();
		
		System.out.println("Enter no of bookings");
		int noOfBookings = sc.nextInt();
			
		System.out.println("Enter the available tickets");
		Ticket.setAvailableTickets(sc.nextInt());
		
		for(int i = 1; i<=noOfBookings; i++) {
			Ticket t = new Ticket();
			
			System.out.println("Enter the ticketid");
			t.setTicketid(sc.nextInt());
				
			System.out.println("Enter the price");
			t.setPrice(sc.nextInt());
				
			System.out.println("Enter the no of tickets");
			int nooftickets = sc.nextInt();
			
			System.out.println("Available tickets: " + Ticket.getAvailableTickets());
			int totalAmount = t.calculateTicketCost(nooftickets);
			
			if(totalAmount == -1) {
				if(Ticket.getAvailableTickets() == 0) {
					System.out.println("House full");
					break;
				}else {
					System.out.println("Tickets are not available");
				}
			}else {
				System.out.println("Total amount: " + totalAmount);
				
				if(Ticket.getAvailableTickets()==0) {
					System.out.println("House full");
				}else {
					System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
					
				}
			}
		}
	}
}


