import java.time.LocalDate;

public interface Study {
	double calculateImpactIndex(int monthsActive);
	double calculateResourceIndex(int monthsActive);
	
	default Study getHigherFundingStudy(Study s1, Study s2) {
		if(((Studyinfo) s1).getFundingAmount() >
		((Studyinfo) s2).getFundingAmount()) {
			
			return s1;
		}else {
			return s2;
		}
	}
	
	public static int getMonthsActive(int startMonth, int startYear) {
		LocalDate ld = LocalDate.now();
		return (ld.getYear() - startYear) * 12 + (ld.getMonthValue() - startMonth);
	}
}
