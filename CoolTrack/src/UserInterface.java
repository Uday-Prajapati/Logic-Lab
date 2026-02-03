import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataCenterUtil util = new DataCenterUtil();

        // Input number of data centers
        System.out.println("Enter the number of data centers to be added");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input data center details
        System.out.println("Enter data center details");
        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(":");

            String dataCenterId = parts[0];
            String location = parts[1];
            String supervisorName = parts[2];
            double coolingPowerUsage = Double.parseDouble(parts[3]);

            DataCenter dc = new DataCenter(
                    dataCenterId,
                    location,
                    supervisorName,
                    coolingPowerUsage
            );

            util.addDataCenter(dc);
        }

        // Search by Data Center ID
        System.out.println("Enter the Data Center ID to get details");
        String searchId = sc.nextLine();

        DataCenter result = util.getDataCenterById(searchId);

        if (result != null) {
            System.out.println(
                    result.getDataCenterId() + " | " +
                    result.getLocaion() + " | " +
                    result.getSupervisionName() + " | " +
                    result.getCoolingPowerusage()
            );
        } else {
            System.out.println("Data Center not found for the ID " + searchId);
        }

        // Display data centers with maximum cooling power usage
        System.out.println("Data Centers with maximum cooling power usage");

        List<DataCenter> maxList =
                util.getDataCentersWithMaximumCoolingPowerUsage();

        for (DataCenter dc : maxList) {
            System.out.println(
                    dc.getDataCenterId() + " | " +
                    dc.getLocaion() + " | " +
                    dc.getSupervisionName() + " | " +
                    dc.getCoolingPowerusage()
            );
        }
    }
}
