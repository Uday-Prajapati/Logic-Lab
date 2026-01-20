public class SteelBero extends Bero {

	// Fill the code
	private int beroHeight;
	
	// getter and setter
	public int getBeroHeight() {
		return beroHeight;
	}
	
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	
	// constructor
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}
	
	public void calculatePrice() {
		// Fill the code
		if(beroHeight == 3) {
			price = 5000;
		}
		else if(beroHeight == 5) {
			price = 8000;
		}
		else if(beroHeight == 7) {
			price = 10000;
		}
	}

}
