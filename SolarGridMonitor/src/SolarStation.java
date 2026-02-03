public class SolarStation {
	
	private String StationId;
	private String region;
	private String technicianName;
	private double dailyGeneration;
	
	public SolarStation(String stationId, String region, String technicianName, double dailyGeneration) {
		super();
		StationId = stationId;
		this.region = region;
		this.technicianName = technicianName;
		this.dailyGeneration = dailyGeneration;
	}
	
	public String getStationId() {
		return StationId;
	}
	public void setStationId(String stationId) {
		StationId = stationId;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	public double getDailyGeneration() {
		return dailyGeneration;
	}
	public void setDailyGeneration(double dailyGeneration) {
		this.dailyGeneration = dailyGeneration;
	}
}
