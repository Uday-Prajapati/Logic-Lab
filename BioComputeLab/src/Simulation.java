import java.time.LocalDate;

public interface Simulation {
//	abstract method 1
	public double calculateImpactScore(int weeksActive);
	
//	abstract method 2
	public double calculateBioLoad(int weeksActive);
	
//	Return experiment with higher fundingAmount
	public default Simulation getHigherFundingSimulation(Simulation s1, Simulation s2) {
		if(((SimulationInfo) s1).getFundingAmount() >
		((SimulationInfo) s1).getFundingAmount()) {
			return s1;
		}
		return s2;
	}
	
//	use LocalDate.now();
//	weeksActive = ((currentYear - startYear)*12 + currentMonth - startMonth) * 4
	public static int getWeeksActive(int startMonth, int startYear) {
		LocalDate ld = LocalDate.now();
		return (ld.getYear() - startYear) * 12 
				+ ld.getMonthValue() - startMonth * 4;
	}
}
