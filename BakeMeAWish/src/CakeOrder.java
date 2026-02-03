import java.util.Map;
import java.util.HashMap;

public class CakeOrder {

	private Map<String,Double> orderMap=new HashMap<String,Double>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}
    
    public void addOrderDetails(String orderId, double cakeCost) {
    	// Requirement 1: Add order details
		orderMap.put(orderId, cakeCost);
	}
	
	// This method filters orders whose cake cost is greater than the specified cakeCost
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost) {
        // New Map to store filtered orders
		Map<String, Double> resultMap = new HashMap<>();
		
		// entrySet() use to traverse key and value
		for(Map.Entry<String, Double> entry : orderMap.entrySet()) {
			
			// entry.getValue() gives cake cost
            // Filter only orders above the given cost
			if(entry.getValue()>cakeCost) {
				 // Store filtered orders in resultMap
				resultMap.put(entry.getKey(), entry.getValue());
			}
		}
		return resultMap;
	}
}