import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DateTimeException;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the zone where the appointment is scheduled");
        String zoneInput = sc.nextLine();

        ZoneId zone;
        try {
            zone = ZoneId.of(zoneInput);
        } catch (DateTimeException e) {
            System.out.println(zoneInput + " is an invalid time zone");
            return;
        }

        System.out.println("Enter the appointment date and time");
        String dateTimeInput = sc.nextLine();

        DateTimeFormatter inputFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime localDateTime;
        try {
            localDateTime =
                    LocalDateTime.parse(dateTimeInput, inputFormatter);
        } catch (DateTimeParseException e) {
            System.out.println(dateTimeInput + " is an invalid input");
            return;
        }

        // Create ZonedDateTime in local zone
        ZonedDateTime localZonedDateTime =
                ZonedDateTime.of(localDateTime, zone);

        // Convert to UTC
        ZonedDateTime utcZonedDateTime =
                localZonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

        // Output formatter
        DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a z");

        System.out.println("Local Appointment Time is " +
                localZonedDateTime.format(outputFormatter));

        System.out.println("Central Appointment Time is " +
                utcZonedDateTime.format(outputFormatter));
    }
}
