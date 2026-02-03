public class Studyinfo implements Study{
	
	private int studyId;
	private String studyTitle;
	private String principalInvestigator; 
	private double fundingAmount; 
	private String domain;
	private int startMonth; 
	private int startYear;
	
	public int getStudyId() {
		return studyId;
	}

	public void setStudyId(int studyId) {
		this.studyId = studyId;
	}

	public String getStudyTitle() {
		return studyTitle;
	}

	public void setStudyTitle(String studyTitle) {
		this.studyTitle = studyTitle;
	}

	public String getPrincipalInvestigator() {
		return principalInvestigator;
	}

	public void setPrincipalInvestigator(String principalInvestigator) {
		this.principalInvestigator = principalInvestigator;
	}

	public double getFundingAmount() {
		return fundingAmount;
	}

	public void setFundingAmount(double fundingAmount) {
		this.fundingAmount = fundingAmount;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public int getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	
	public Studyinfo(int studyId, String studyTitle, String principalInvestigator, double fundingAmount, String domain,
			int startMonth, int startYear) {
		super();
		this.studyId = studyId;
		this.studyTitle = studyTitle;
		this.principalInvestigator = principalInvestigator;
		this.fundingAmount = fundingAmount;
		this.domain = domain;
		this.startMonth = startMonth;
		this.startYear = startYear;
	}

	@Override
	public double calculateImpactIndex(int monthsActive) {
		// TODO Auto-generated method stub
		double multiplier = 0;
		
		if(domain.equals("Nano")) {
			multiplier = 2.2;
		}
		else if(domain.equals("Photon")) {
			multiplier = 1.9;
		}
		else if(domain.equals("Bio")) {
			multiplier = 2.7;
		}
		
		return multiplier * monthsActive * fundingAmount;
	}

	@Override
	public double calculateResourceIndex(int monthsActive) {
		// TODO Auto-generated method stub
		double rates = 0;
		if(domain.equals("Nano")) {
			rates = 2.2;
		}
		else if(domain.equals("Photon")) {
			rates = 1.9;
		}
		else if(domain.equals("Bio")) {
			rates = 2.7;
		}
		 double resourdeIndex =  (monthsActive * rates * fundingAmount) / 200;
		 return Math.round( resourdeIndex * 10.0) / 10.0;
	}

}
