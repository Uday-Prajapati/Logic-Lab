public abstract class Bero {
	// Fill the code
	
	protected String beroType;
	protected String beroColour;
	protected double price;
	
	// getter and setter
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	
	// colour
	public String getBeroColour() {
		return beroColour;
	}
	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}
	
	// price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// constructor
	public Bero(String beroType, String beroColour) {
		this.beroType = beroType;
		this.beroColour = beroColour;
	}
	
	// method
	public abstract void calculatePrice();
}
