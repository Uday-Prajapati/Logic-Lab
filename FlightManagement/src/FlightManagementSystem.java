import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem
{
    // Fill the code
    public boolean addFlight(Flight flightObj) {
    	
		boolean isAdded = false;

		
		try {
			Connection con = DB.getConnection();
			
			// insert
			String query = "INSERT INTO flight (flightId, source, destination, noofseats, flightfare) VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			// set values using flight object
			ps.setInt(1, flightObj.getFlightId());
			ps.setString(2, flightObj.getSource());
			ps.setString(3, flightObj.getDestination());
			ps.setInt(4, flightObj.getNoOfSeats());
			ps.setDouble(5, flightObj.getFlightFare());
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				isAdded = true;
			}
			
		}catch(Exception e){
			isAdded = false;
		}
    	return isAdded;
    }
}
