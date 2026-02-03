import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GadgetValidatorUtil gv = new GadgetValidatorUtil();
        // Fill the code here
        System.out.println("Enter the number of gadget entries");
        int noOfgadget = Integer.parseInt(scanner.nextLine());
        
        for(int i=1; i<=noOfgadget; i++) {
        	System.out.println("Enter gadget" + i + "details");
        	String details = scanner.nextLine();
        	
        	try {
        		String[] data = details.split(":");
        		
        		String gadgetId = data[0];
        		int period = Integer.parseInt(data[2]);
        		
        		gv.validateGadgetID(gadgetId);
        		gv.validateWarrantyPeriod(period);
        		
        		System.out.println("Warranty accepted, stock updated");
        	}
        	catch(InvalidGadgetException e) {
        		System.out.println(e.getMessage());
        	}
        }
    }
}
