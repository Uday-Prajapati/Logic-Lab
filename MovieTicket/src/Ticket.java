public class Ticket
{
    // Fill the code
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	// getter and setter
	// ticket id
	public void setTicketid(int ticketid) {
		this.ticketid= ticketid;
	}
	
    public int getTicketid() {
    	return ticketid;
    }
    
    // price
    public void setPrice(int price) {
    	this.price=price;
    }
    
    public int getPrice() {
    	return price;
    }
    
    // availableTickets
    public static void setAvailableTickets(int availableTickets) {
    	Ticket.availableTickets=availableTickets;
    }
    
    public static int getAvailableTickets() {
    	return availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets)
    {
        // Fill the code
    	if(availableTickets < 0 || availableTickets < nooftickets) {
    		return -1;
    	}
        
    	int totalAmount = nooftickets * price;
    	availableTickets = availableTickets - nooftickets;
    	return totalAmount;
    }
    
}