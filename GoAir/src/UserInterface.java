import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of entries");
        int entries = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= entries; i++) {

            System.out.println("Enter entry " + i + " details");
            String details = scanner.nextLine();

            try {
                String[] data = details.split(":");

                String employeeId = data[0];
                int duration = Integer.parseInt(data[2]);

                EntryUtility.validateEmployeeId(employeeId);
                EntryUtility.validateDuration(duration);

                System.out.println("Valid entry details");

            } catch (InvalidEntryException e) {
                System.out.println("Invalid entry details");
            }
        }

        scanner.close();
    }
}
