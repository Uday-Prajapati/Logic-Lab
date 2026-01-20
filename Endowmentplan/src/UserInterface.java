import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Endowment Id");
        String id = sc.nextLine();

        System.out.println("Enter Holder Name");
        String name = sc.nextLine();

        System.out.println("Enter Endowment Type");
        String type = sc.nextLine();

        if (!type.equalsIgnoreCase("Educational") &&
            !type.equalsIgnoreCase("Health")) {
            System.out.println(type + " is an invalid endowment type");
            return;
        }

        System.out.println("Enter Registration Date");
        String registrationDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate.parse(registrationDate, formatter); // validation

        if (type.equalsIgnoreCase("Educational")) {

            System.out.println("Enter Educational Institution");
            String institution = sc.nextLine();

            System.out.println("Enter Educational Division");
            String division = sc.nextLine();

            EducationalEndowment ee =
                new EducationalEndowment(id, name, type,
                        registrationDate, institution, division);

            System.out.printf("Endowment Amount %.2f",
                    ee.calculateEndowment());
        }

        if (type.equalsIgnoreCase("health")) {
        	System.out.println("Enter Health Care Center");
        	String center = sc.nextLine();
        	
        	System.out.println("Enter Holder Age");
        	int age = sc.nextInt();
        	
        	HealthEndowment he = new HealthEndowment(id, name, type,
                            registrationDate, center, age);

                System.out.printf("Endowment Amount %.2f", he.calculateEndowment());
        }
    }
}
