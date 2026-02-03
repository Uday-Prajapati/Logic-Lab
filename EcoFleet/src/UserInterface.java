import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleUtil util = new VehicleUtil();

        System.out.println("Enter the number of vehicles");
        int noOfVehicle = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter vehicle details");
        for (int i = 0; i < noOfVehicle; i++) {
            String details = sc.nextLine();

            String[] data = details.split(":");

            String regNumber = data[0];
            String city = data[1];
            String ownerName = data[2];
            double emissionRate = Double.parseDouble(data[3]);

            Vehicle v = new Vehicle(
                    regNumber,
                    city,
                    ownerName,
                    emissionRate);
            util.addVehicle(v);
        }

        // search by number
        System.out.println("Enter the Registration Number to get details");
        String id = sc.nextLine();

        Vehicle result = util.getVehicleByRegNumber(id);

        if (result != null) {
            System.out.println(result.getRegNumber());
            System.out.println(result.getCity());
            System.out.println(result.getOwnerName());
            System.out.println(result.getEmissionRate());
        } else {
            System.out.println("Vehicle not found for the registration " + id);
        }

//        print the result
        System.out.println("Vehicles with minimum emission rate");
        List<Vehicle> minEmission = util.getVehiclesWithMinimumEmission();

        for (Vehicle v : minEmission) {
            System.out.println(v.getRegNumber());
            System.out.println(v.getCity());
            System.out.println(v.getOwnerName());
            System.out.println(v.getEmissionRate());
        }
    }
}
