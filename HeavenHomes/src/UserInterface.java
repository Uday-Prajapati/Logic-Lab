import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Apartment apt = new Apartment();

        System.out.println("Enter number of details to be added");
        int noOfdetail = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter the details (Apartment number: Rent)");

        for (int i = 0; i < noOfdetail; i++) {

            // Read full input like A746:180.0
            String aptNoRent = sc.nextLine();

            // Split using colon
            String[] part = aptNoRent.split(":");

            // Extract apartment number
            String apartmentNumber = part[0];

            // Extract rent from split string (IMPORTANT FIX)
            double rent = Double.parseDouble(part[1]);

            // Store details
            apt.addApartmentDetails(apartmentNumber, rent);
        }

        System.out.println("Enter the range to filter the details");
        double minimumRent = sc.nextDouble();
        double maximumRent = sc.nextDouble();

        // Calculate total rent
        double totalRent =
                apt.findTotalRentOfApartmentsInTheGivenRange(minimumRent, maximumRent);

        if (totalRent == 0) {
            System.out.println("No apartments found in this range");
        } else {
            System.out.println(
                "Total Rent in the range " + minimumRent +
                " to " + maximumRent + " USD:" + totalRent
            );
        }
    }
}
