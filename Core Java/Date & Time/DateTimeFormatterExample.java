import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1: Formatter for input
		DateTimeFormatter inputF = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm");
		
		// Step 2: Parse string
		LocalDateTime dt = LocalDateTime.parse("2023/12/23 14:32", inputF);
		
		// Step 3: calculation
		LocalDateTime newDt = dt.plusHours(4);
		
		// Step 4 : formatter for output
		DateTimeFormatter outputF = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
		
		// output
		System.out.println(newDt.format(outputF));

//		Example
        DateTimeFormatter input =
            DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        DateTimeFormatter output =
            DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

        LocalDateTime checkIn =
            LocalDateTime.parse("2023/12/23 14:32", input);

        LocalDateTime checkOut =
            checkIn.plusHours(4);

        System.out.println("Check-in: " + checkIn.format(output));
        System.out.println("Check-out: " + checkOut.format(output));

	}
}
