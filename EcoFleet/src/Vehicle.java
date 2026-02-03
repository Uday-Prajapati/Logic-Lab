public class Vehicle {
	private String regNumber; 
	private String city;
	private String ownerName; 
	private double emissionRate;
	
	public Vehicle(String regNumber, String city, String ownerName, double emissionRate) {
		super();
		this.regNumber = regNumber;
		this.city = city;
		this.ownerName = ownerName;
		this.emissionRate = emissionRate;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getEmissionRate() {
		return emissionRate;
	}

	public void setEmissionRate(double emissionRate) {
		this.emissionRate = emissionRate;
	}
}
