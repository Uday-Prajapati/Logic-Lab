import java.util.Scanner;

class ResortBooking{
	private String customerName;
	private int adult;
	private int children;
	private int days;
	
	public void setDetails(String input) {
		String[] data = input.split(":");
		
		customerName = data[0];
		adult = Integer.parseInt(data[1]);
		children = Integer.parseInt(data[2]);
		days = Integer.parseInt(data[3]);
	}
	
	public void calculateBooking() {
		if(adult < 0) {
			System.out.println("Invalid input for number of adults");
			return;
		}
		
		if(children < 0) {
			System.out.println("Invalid input for number of children");
			return;
		}
		
		if(days <= 0) {
			System.out.println("Invalid input for number of days");
			return;
		}
		
		// main formula
		int adultCost = adult * 1000 * days;
		int childCost = children * 650 * days;
		int totalCost = adultCost + childCost;
		
		System.out.println(customerName + " your booking is confirmed and the total cost is " + totalCost);
	}
}
public class UserInterface {
    public static void main(String args[])
    {
    //fill the code here
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the customer detail");
    String input = sc.nextLine();
    
    ResortBooking rb = new ResortBooking();
    rb.setDetails(input);
    rb.calculateBooking();
    
    }
}
