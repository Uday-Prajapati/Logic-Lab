import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        // FILL THE CODE HERE
        System.out.println("Enter check in date and time");
        String checkInInput = sc.nextLine();
        
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
                
        LocalDateTime checkInDateTime;
        
        try {
        	checkInDateTime = LocalDateTime.parse(checkInInput, inputFormatter);
        }catch (Exception e) {
        	 System.out.println(checkInInput + " is an invalid check in date or time");
             return;
        }
        
        System.out.println("Enter number of hours of stay");
        int hours = sc.nextInt();
        
        LocalDateTime checkOutDateTime = checkInDateTime.plusHours(hours);
        
        System.out.println("Check in Date and Time is "
                + checkInDateTime.format(outputFormatter));

        System.out.println("Check out Date and Time is "
                + checkOutDateTime.format(outputFormatter));
    }
}
