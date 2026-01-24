import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FlightManagementSystem
{
    // Fill the code
	public ArrayList<Flight> viewFlightsBySourceAndDestination(String source,String destination){
		
		ArrayList<Flight> flightList = new ArrayList<>();
		
		try {
			Connection con = DB.getConnection();
			
			String query = "Select * from flight where source = ? and destination = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, source);
			ps.setString(2, destination);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int flightId = rs.getInt("flightId");
				String src = rs.getString("source");
				String dest = rs.getString("destination");
				int noOfSeats = rs.getInt("noofSeats");
				double flightFare = rs.getDouble("flightfare");
				
				Flight flight = new Flight(flightId, src, dest, noOfSeats, flightFare);
				flightList.add(flight);
			}
			rs.close();
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flightList;
	}
    
}