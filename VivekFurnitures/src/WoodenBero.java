public class WoodenBero extends Bero {
	// Fill the code
	private String woodType;
	
	// getter and setter
	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	// constructor
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}
	
	// method
	public void calculatePrice() {
		// Fill the code
		
		if(woodType.equalsIgnoreCase("Ply Wood")) {
			price = 15000;
		}
		else if(woodType.equalsIgnoreCase("Teak Wood")) {
			price = 12000;
		}
		else if(woodType.equalsIgnoreCase("Engineered Wood")) {
			price = 10000;
		}
	}
}
