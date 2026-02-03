import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate join =
			    LocalDate.of(2006, 8, 21);

			LocalDate current =
			    LocalDate.of(2020, 12, 15);

			Period p =
			    Period.between(join, current);

			System.out.println(p.getYears() + " years");
	}
}
