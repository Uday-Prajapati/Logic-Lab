public class HealthEndowment extends Endowment {
	
	// Fill the code
	private String healthCareCenter;
	private int holderAge;
	
	// getter and setter
	// getHealthCareCenter
	public String getHealthCareCenter() {
		return healthCareCenter;
	}

	public void setHealthCareCenter(String healthCareCenter) {
		this.healthCareCenter = healthCareCenter;
	}

	// holderAge
	public int getHolderAge() {
		return holderAge;
	}

	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}
	
	// constructor
	public HealthEndowment(String endowmentId, String holderName,
            String endowmentType, String registrationDate,
            String healthCareCenter, int holderAge) {
			super(endowmentId, holderName, endowmentType, registrationDate);
			this.healthCareCenter = healthCareCenter;
			this.holderAge = holderAge;
	}
	
	//method
	public double calculateEndowment(){
		// Fill the code
		
		if(holderAge <= 30) {
			return 120000;
		}
		else if(holderAge > 30 && holderAge < 60) {
			return 200000;
		}
		else if(holderAge >= 60) {
			return 500000;
		}
		return 0;
	}

}
