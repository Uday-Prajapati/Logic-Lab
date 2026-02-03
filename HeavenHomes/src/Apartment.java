import java.util.Map;
import java.util.HashMap;

public class Apartment {

	private Map<String, Double> apartmentDetailsMap = new HashMap<String, Double>();

    public Map<String, Double> getApartmentDetailsMap() {
		return apartmentDetailsMap;
	}

	public void setApartmentDetailsMap(Map<String, Double> apartmentDetailsMap) {
		this.apartmentDetailsMap = apartmentDetailsMap;
	}
	
	public void addApartmentDetails(String apartmentNumber, double rent) {
        //Fill the code here
		apartmentDetailsMap.put(apartmentNumber, rent);
	}

	public double findTotalRentOfApartmentsInTheGivenRange(double minimumRent, double maximumRent) {
		//Fill the code here
		// Variable to store the total rent
		double totalRent = 0.0;
		
		for(Map.Entry<String, Double> entry : apartmentDetailsMap.entrySet()) {
			// get the rend value
			double rent = entry.getValue();

			// Check if rent lies within the given range (inclusive)
			if(rent > minimumRent && rent <= maximumRent) {
//				  // Add rent to total
				totalRent = totalRent + rent;
			}
		}
		return totalRent;
	}

}
