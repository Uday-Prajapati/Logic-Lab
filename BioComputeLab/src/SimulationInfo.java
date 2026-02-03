public class SimulationInfo implements Simulation{
	private int simulationId;
	private String simulationName;
	private String leadScientist;
	private double fundingAmount;
	private String proteinType;
	private int startMonth;
	private int startYear;
	
	public SimulationInfo(int simulationId, String simulationName, String leadScientist, double fundingAmount,
			String proteinType, int startMonth, int startYear) {
		super();
		this.simulationId = simulationId;
		this.simulationName = simulationName;
		this.leadScientist = leadScientist;
		this.fundingAmount = fundingAmount;
		this.proteinType = proteinType;
		this.startMonth = startMonth;
		this.startYear = startYear;
	}
	
	public int getSimulationId() {
		return simulationId;
	}
	public void setSimulationId(int simulationId) {
		this.simulationId = simulationId;
	}
	public String getSimulationName() {
		return simulationName;
	}
	public void setSimulationName(String simulationName) {
		this.simulationName = simulationName;
	}
	public String getLeadScientist() {
		return leadScientist;
	}
	public void setLeadScientist(String leadScientist) {
		this.leadScientist = leadScientist;
	}
	public double getFundingAmount() {
		return fundingAmount;
	}
	public void setFundingAmount(double fundingAmount) {
		this.fundingAmount = fundingAmount;
	}
	public String getProteinType() {
		return proteinType;
	}
	public void setProteinType(String proteinType) {
		this.proteinType = proteinType;
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

	@Override
	public double calculateImpactScore(int weeksActive) {
		
		double mutliplier = 0;
		
		if(proteinType.equals("Alpha")) {
			mutliplier = 1.2;
		}
		else if(proteinType.equals("Beta")) {
			mutliplier = 2.1;
		}
		else if(proteinType.equals("Gamma")) {
			mutliplier = 3.4;
		}
		return (mutliplier * weeksActive * fundingAmount) / 2000;
	}

	@Override
	public double calculateBioLoad(int weeksActive) {
		
		double loadMultiplier = 0;
		
		if(proteinType.equals("Alpha")) {
			loadMultiplier = 0.7;
		}
		else if(proteinType.equals("Beta")) {
			loadMultiplier = 1.1;
		}
		else if(proteinType.equals("Gamma")) {
			loadMultiplier = 1.6;
		}
		
		double bioLoad = (weeksActive * loadMultiplier * fundingAmount)/150;
		return Math.round(bioLoad * 10.0) / 10.0;
	}
}
