import java.time.Year;

public interface Room {
	//Fill the code here
	public double calculateTotalBill(int nightsStayed, int joiningYear);
	
	public default int calculateMembershipYears(int joiningYear) {
		int currentYear = Year.now().getValue();
		return currentYear - joiningYear;
	}
}
