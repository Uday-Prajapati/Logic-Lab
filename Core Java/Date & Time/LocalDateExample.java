import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get current
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// custome date
		LocalDate date1 = LocalDate.of(2025,12,25);
	
		
		// methods
		// Step 2: Fetch individual values
        int day = date.getDayOfMonth();   // 25
        var month = date.getMonth();     // DECEMBER
        int year = date.getYear();        // 2023

        // Step 3: Perform date operations
        LocalDate after10 = date.plusDays(10);
        LocalDate before2Months = date.minusMonths(2);

        // Step 4: Display results
        System.out.println("Original Date: " + date);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        System.out.println("Date after 10 days: " + after10);
        System.out.println("Date before 2 months: " + before2Months);
	}

}
