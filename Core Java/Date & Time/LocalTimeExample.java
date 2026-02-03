import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// custom
		LocalTime time1 = LocalTime.of(14,30);
		System.out.println(time1);
		
		// parse using string
		LocalTime time2 = LocalTime.parse("14:30");
		System.out.println(time2);
		
		// methods
		int hours = time.getHour();
		System.out.println(hours);
		
		int minute = time.getMinute();
		System.out.println(minute);
		
		LocalTime hours1 = time.plusHours(2);
		System.out.println(hours1);
		
		LocalTime minutes1 = time.minusMinutes(25);
		System.out.println(minutes1);
		
	}
}
