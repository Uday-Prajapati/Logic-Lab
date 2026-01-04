import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);

        // Create Custom Date
        LocalDate dob = LocalDate.of(2000, 5, 10);
        System.out.println("Date of Birth: " + dob);

        // Modify Date (immutability)
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);

        // Period (difference between dates)
        Period age = Period.between(dob, today);
        System.out.println("Age: " + age.getYears() + " years");

        // Duration (difference between times)
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);
        Duration workHours = Duration.between(start, end);
        System.out.println("Working hours: " + workHours.toHours() + " hours");

        // Formatting Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Parsing Date
        LocalDate parsedDate = LocalDate.parse("03-01-2026", formatter);
        System.out.println("Parsed Date: " + parsedDate);

        // Time Zone (basic) show utc time zone as mentioned  
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India Time Zone DateTime: " + zonedDateTime);
    }
}
