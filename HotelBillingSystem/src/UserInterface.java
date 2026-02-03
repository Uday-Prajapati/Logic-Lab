import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fill the code here
//        Delux Room
        System.out.println("Enter Deluxe Room Details:");
        System.out.println("Guest Name:");
        String deluxeGuest = sc.nextLine();
        
        System.out.println("Rate per Night:");
        double deluxeRate = sc.nextDouble();
        
        System.out.println("Night Stayed:");
        int deluxeNights = sc.nextInt();
        
        System.out.println("Joining Year:");
        int deluxeYear = sc.nextInt();
        sc.nextLine();
        
//        object of hotel
        HotelRoom deluxeRoom = new HotelRoom("Deluxe", deluxeRate, deluxeGuest);
        
//      invoke the method
        int deluxeMembership = deluxeRoom.calculateMembershipYears(deluxeYear);
        double deluxeBill = deluxeRoom.calculateTotalBill(deluxeYear, deluxeMembership);
        
        
//        Suites Input
        System.out.println("\nEnter Suite Room Details:");
        System.out.println("Guest Name:");
        String suiteGuest = sc.nextLine();

        System.out.println("Rate per Night:");
        double suiteRate = sc.nextDouble();

        System.out.println("Nights Stayed:");
        int suiteNights = sc.nextInt();

        System.out.println("Joining Year:");
        int suiteYear = sc.nextInt();
        

        HotelRoom suiteRoom = new HotelRoom("Suite", suiteRate, suiteGuest);

        int suiteMembership = suiteRoom.calculateMembershipYears(suiteYear);
        double suiteBill = suiteRoom.calculateTotalBill(suiteNights, suiteYear);

        // Output
        System.out.println("\nRoom Summary:");
        System.out.println("Deluxe Room: " + deluxeRoom.getGuestName() + ", "
                + deluxeRoom.getRatePerNight() + " per night, Membership: "
                + deluxeMembership + " years");

        System.out.println("Suite Room: " + suiteRoom.getGuestName() + ", "
                + suiteRoom.getRatePerNight() + " per night, Membership: "
                + suiteMembership + " years");

        System.out.println("\nTotal Bill:");
        System.out.println("For " + deluxeRoom.getGuestName()
                + " (Deluxe): " + deluxeBill);

        System.out.println("For " + suiteRoom.getGuestName()
                + " (Suite): " + suiteBill);
    }
}
