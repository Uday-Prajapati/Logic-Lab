import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class VehicleUtil {
	private Set<Vehicle> vehicleSet = new LinkedHashSet<>();

	public Set<Vehicle> getVehicleSet() {
		return vehicleSet;
	}

	public void setVehicleSet(Set<Vehicle> vehicleSet) {
		this.vehicleSet = vehicleSet;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicleSet.add(vehicle);
	}
	
//	retrive by number
	public Vehicle getVehicleByRegNumber(String regNumber) {
		for(Vehicle v : vehicleSet) {
			if(v.getRegNumber().equals(regNumber)) {
				return v;			}
		}
		return null;
	}
	
//	retrive with minimum emission rate
	public List<Vehicle> getVehiclesWithMinimumEmission(){
		List<Vehicle> resultList = new ArrayList<>();
		
		if( vehicleSet.isEmpty()) {
			return resultList;
		}
		
		double minimumEmissionCost = vehicleSet.iterator().next().getEmissionRate();
		
//		find the minimum cost
		for(Vehicle v : vehicleSet) {
			if(v.getEmissionRate() < minimumEmissionCost) {
				minimumEmissionCost = v.getEmissionRate();
			}
		}
		
//		collect
		for(Vehicle v : vehicleSet) {
			if(v.getEmissionRate() == minimumEmissionCost) {
				resultList.add(v);
			}
		}
		return resultList;
	}
}
