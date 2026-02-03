import java.util.List;
import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolarStationUtil util = new SolarStationUtil();
		
		System.out.println("Enter the number of stations");
		int noOfStation = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter station details");
		for(int i=0; i<noOfStation; i++) {
			String input = sc.nextLine();
			
			String[] data = input.split(":");
			
			String stationId = data[0];
			String region = data[1];
			String technicianName = data[2];
			
			double  dailyGeneration = Double.parseDouble(data[3]);
			
			SolarStation ss = new SolarStation(
					stationId,
					region,
					technicianName,
					dailyGeneration);
			util.addSolarStation(ss);
		}
		
//		search by id
		System.out.println("Enter the Station ID to get details");
		String id = sc.nextLine();
		
		SolarStation result = util.getSolarStationById(id);
		
		if (result != null) {
		    System.out.println(result.getStationId());
		    System.out.println(result.getRegion());
		    System.out.println(result.getTechnicianName());
		    System.out.println(result.getDailyGeneration());
		} else {
		    System.out.println("Station not found for the ID " + id);
		}

		
//		station with maximum power generation
		
		List<SolarStation> minList = util.getStationsWithMinimumGeneration();
		System.out.println("Stations with minimum power generation");
		for(SolarStation s : minList) {
			System.out.println(result.getStationId());
			System.out.println(result.getRegion());
			System.out.println(result.getTechnicianName());
			System.out.println(result.getDailyGeneration());		
		}
	}
}
