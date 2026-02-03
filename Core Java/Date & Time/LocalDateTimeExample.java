import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		//custom
		LocalDateTime ldt1 = LocalDateTime.of(2023,12,23,12,32);
		System.out.println(ldt1);
		
		
	}
}
