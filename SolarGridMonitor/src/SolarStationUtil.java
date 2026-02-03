import java.util.ArrayList;
import java.util.List;

public class SolarStationUtil {
	private List<SolarStation> stationList = new ArrayList<>();

	public List<SolarStation> getStationList() {
		return stationList;
	}

	public void setStationList(List<SolarStation> stationList) {
		this.stationList = stationList;
	}
	
//	add
	public void addSolarStation(SolarStation station) {
		stationList.add(station);
	}
	
//	Retrive station id
	public SolarStation getSolarStationById(String stationId) {
		for(SolarStation s : stationList) {
			if(s.getStationId().equals(stationId)) {
				return s;
			}
		}
		return null;
	}
	
//	retrive staiton with minimum energy generation
	
	public List<SolarStation> getStationsWithMinimumGeneration(){
		List<SolarStation> resultList = new ArrayList<>();
		
		if (stationList.isEmpty()) {
		       return resultList;
		}

		double minimumEnergyGeneration = stationList.get(0).getDailyGeneration();
		
//		find the minimum energy
		for(SolarStation s : stationList) {
			if(s.getDailyGeneration() < minimumEnergyGeneration) {
				minimumEnergyGeneration = s.getDailyGeneration();
			}
		}
		
//		collect the minimum one
		for (SolarStation s : stationList) {
			if (s.getDailyGeneration() == minimumEnergyGeneration) {
	           resultList.add(s);
			}
	    }
		return resultList;	
	}
}
